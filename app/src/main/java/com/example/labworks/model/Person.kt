package com.example.labworks.model

import java.io.Serializable

class Person : Serializable {
    var name: String
    var address: String
    var mobile: String
    var gender: String

    constructor(name: String, address: String, mobile: String, gender: String) {
        this.name = name
        this.address = address
        this.mobile = mobile
        this.gender = gender
    }

    override fun toString(): String {
        return name
    }
}

