package br.com.caelum.codehouse.store.resource.impl

import br.com.caelum.codehouse.store.model.Book
import br.com.caelum.codehouse.store.resource.FindAllBooksResource
import br.com.caelum.codehouse.store.resource.FindBookByIdResource
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
class BookResourceImpl : FindAllBooksResource<Flux<ResponseEntity<Book>>>,
        FindBookByIdResource<Mono<ResponseEntity<Book>>, Mono<Book>> {

    @GetMapping(produces = [ MediaType.APPLICATION_STREAM_JSON_VALUE ])
    override fun find(): Flux<ResponseEntity<Book>> {
        TODO("Not yet implemented")
    }

    @GetMapping("/{id}", consumes = [ MediaType.APPLICATION_STREAM_JSON_VALUE ],
            produces = [ MediaType.APPLICATION_STREAM_JSON_VALUE ])
    override fun find(@PathVariable id: Mono<Book>): Mono<ResponseEntity<Book>> {
        TODO("Not yet implemented")
    }
}