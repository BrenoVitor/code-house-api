package br.com.caelum.codehouse.store.service

interface FindBookByIdService<T,K> {

    fun find(id : K) : T

}