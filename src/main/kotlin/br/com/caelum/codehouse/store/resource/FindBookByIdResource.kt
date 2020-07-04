package br.com.caelum.codehouse.store.resource

interface FindBookByIdResource<T,K> {

    fun find(id : K) : T
}