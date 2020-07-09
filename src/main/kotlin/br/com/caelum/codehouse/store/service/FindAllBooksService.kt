package br.com.caelum.codehouse.store.service

interface FindAllBooksService<T> {

    fun find() : T

}