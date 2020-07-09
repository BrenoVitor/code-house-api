package br.com.caelum.codehouse.store.controller.impl

import br.com.caelum.codehouse.store.controller.FindAllBooksController
import br.com.caelum.codehouse.store.model.Book
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux

@Controller
class FindAllBooksControllerImpl : FindAllBooksController<Flux<Book>> {

    override fun find(): Flux<Book> {
        TODO("Not yet implemented")
    }
}