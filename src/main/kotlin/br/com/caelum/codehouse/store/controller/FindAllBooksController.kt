package br.com.caelum.codehouse.store.controller

interface FindAllBooksController<T> {

    fun find() : T

}