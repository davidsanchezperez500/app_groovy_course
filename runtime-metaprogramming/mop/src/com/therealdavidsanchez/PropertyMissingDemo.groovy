package com.therealdavidsanchez

class Foo {

    def propertyMissing(String name) {
        "caught missing property: $name"
    }

}

println new Foo().bar