package br.com.caelum.codehouse.store.controller

interface FindBookByIdController<T,K> {

    fun find(id : K) : T

}