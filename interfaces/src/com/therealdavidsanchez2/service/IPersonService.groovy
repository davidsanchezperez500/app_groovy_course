package com.therealdavidsanchez2.service

import com.therealdavidsanchez2.domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()

}