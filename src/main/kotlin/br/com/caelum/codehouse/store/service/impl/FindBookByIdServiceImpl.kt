package br.com.caelum.codehouse.store.service.impl

import br.com.caelum.codehouse.store.model.Book
import br.com.caelum.codehouse.store.service.FindBookByIdService
import reactor.core.publisher.Mono

class FindBookByIdServiceImpl : FindBookByIdService<Mono<Book>,Long> {

    override fun find(id: Long): Mono<Book> {
        TODO("Not yet implemented")
    }
}