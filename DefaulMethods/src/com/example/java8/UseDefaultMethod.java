package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.java8.model.Person;

public class UseDefaultMethod {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Predicate<Person> pred = (p) -> p.getAge() > 65;
		
		displayPeople(people, pred);
		
	}

	private static void displayPeople(List<Person> people, Predicate<Person> pred) {
		System.out.println("Selected:");
		people.forEach(person -> {
			if(pred.test(person)){
				System.out.println(person.getPersonInfo());
			}
		});
	}

}
