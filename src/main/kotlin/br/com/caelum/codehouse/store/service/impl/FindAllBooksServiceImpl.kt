package br.com.caelum.codehouse.store.service.impl

import br.com.caelum.codehouse.store.model.Book
import br.com.caelum.codehouse.store.service.FindAllBooksService
import reactor.core.publisher.Flux

class FindAllBooksServiceImpl : FindAllBooksService<Flux<Book>> {

    override fun find(): Flux<Book> {
        TODO("Not yet implemented")
    }

}