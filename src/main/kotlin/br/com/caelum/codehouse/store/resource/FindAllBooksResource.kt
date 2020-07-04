package br.com.caelum.codehouse.store.resource

interface FindAllBooksResource<T> {

    fun find() : T
}