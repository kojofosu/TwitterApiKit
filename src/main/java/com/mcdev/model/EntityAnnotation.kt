package com.mcdev.model

class EntityAnnotation{
    val start: Int = 0
    val end: Int = 0
    val probability: Double = 0.0
    val type: String? = null
    val normalizedText: String? = null

    enum class Type(val value: String){
        PERSON("Person"),
        PLACE("Place"),
        PRODUCT("Product"),
        ORGANIZATION("Organization "),
        OTHER("Other ")
    }
}


