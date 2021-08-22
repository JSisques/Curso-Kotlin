package com.jsisques.cursokotlin

class Programmer(
        var name: String,
        var age: Int,
        var languages: Array<Language>,
        var friends: Array<Programmer>? = null
) {

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code(){
        for (language in languages){
            println("Estoy programando en $language")
        }
    }
}