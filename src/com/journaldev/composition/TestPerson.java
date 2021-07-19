package com.journaldev.composition;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        @SuppressWarnings("unused")
		long salary = person.getSalary();
    }

}
