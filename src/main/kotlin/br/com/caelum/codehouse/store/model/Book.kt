package br.com.caelum.codehouse.store.model

data class Book(

        val name : String,

        val description : String,

        val summary : String,

        val authors : Authors,

        val pageNumbers : Int,

        val isbn : Int


)