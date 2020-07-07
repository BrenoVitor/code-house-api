package br.com.caelum.codehouse.store.controller.impl

import br.com.caelum.codehouse.store.controller.FindAllBooksController
import br.com.caelum.codehouse.store.controller.FindBookByIdController
import br.com.caelum.codehouse.store.model.Book
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Controller
class BookControllerImpl : FindAllBooksController<Flux<Book>>, FindBookByIdController<Mono<Book>,Long> {

    override fun find(): Flux<Book> {
        TODO("Not yet implemented")
    }

    override fun find(id: Long): Mono<Book> {
        TODO("Not yet implemented")
    }
}