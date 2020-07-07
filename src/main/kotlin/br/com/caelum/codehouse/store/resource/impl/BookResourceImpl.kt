package br.com.caelum.codehouse.store.resource.impl

import br.com.caelum.codehouse.store.controller.FindAllBooksController
import br.com.caelum.codehouse.store.controller.FindBookByIdController
import br.com.caelum.codehouse.store.model.Book
import br.com.caelum.codehouse.store.resource.FindAllBooksResource
import br.com.caelum.codehouse.store.resource.FindBookByIdResource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/books")
class BookResourceImpl(
        @Autowired
        val findAllBooksController : FindAllBooksController<Flux<Book>>,

        val findBookByIdController : FindBookByIdController<Mono<Book>, Long>

) : FindAllBooksResource<ResponseEntity<Flux<Book>>>,
FindBookByIdResource<ResponseEntity<Mono<Book>>, Long> {

    @GetMapping(produces = [ MediaType.APPLICATION_STREAM_JSON_VALUE ])
    override fun find(): ResponseEntity<Flux<Book>> {
        return ResponseEntity.ok(findAllBooksController.find())
    }

    @GetMapping("/{id}", consumes = [ MediaType.APPLICATION_STREAM_JSON_VALUE ],
            produces = [ MediaType.APPLICATION_STREAM_JSON_VALUE ])
    override fun find(@PathVariable id: Long): ResponseEntity<Mono<Book>> {
        return ResponseEntity.ok(findBookByIdController.find(id));
    }
}