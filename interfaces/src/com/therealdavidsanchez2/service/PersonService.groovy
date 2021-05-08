package com.therealdavidsanchez2.service


import com.therealdavidsanchez2.domain.Person

class PersonService implements IPersonService {

    @Override
    Person find() {
        Person p = new Person(first:"David",last:"Sanchez")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first:"David",last:"Sanchez")
        Person p2 = new Person(first:"Jose",last:"Garcia")
        [p1,p2]
    }
}