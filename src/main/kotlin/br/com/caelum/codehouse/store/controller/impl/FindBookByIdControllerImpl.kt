package br.com.caelum.codehouse.store.controller.impl

import br.com.caelum.codehouse.store.controller.FindBookByIdController
import br.com.caelum.codehouse.store.model.Book
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class FindBookByIdControllerImpl : FindBookByIdController<Mono<Book>,Long> {

    override fun find(id: Long): Mono<Book> {
        TODO("Not yet implemented")
    }
}