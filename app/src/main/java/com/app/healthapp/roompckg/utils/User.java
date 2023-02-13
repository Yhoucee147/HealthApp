package com.app.healthapp.roompckg.utils;

import com.app.healthapp.roompckg.entities.Person;

public class User {

    private static Person person;

    public static Person getPerson() {
        return person;
    }

    public static void setPerson(Person person) {
        User.person = person;
    }
}
