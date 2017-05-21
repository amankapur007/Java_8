package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.java8.model.Person;

public class StaticReferenceMethod {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people, Person :: compareAges);
		people.forEach((p) -> System.out.println(p));
	}
}
