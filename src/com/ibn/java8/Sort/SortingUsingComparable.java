package com.ibn.java8.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {

	private String name;
	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class SortingUsingComparable {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();
		person.add(new Person("Ibney", 31));
		person.add(new Person("Hashim", 34));
		person.add(new Person("MohdAli", 20));
		person.add(new Person("Rizwan", 40));
		person.add(new Person("Salik", 30));
		person.add(new Person("Firoj", 10));
		person.add(new Person("Gufran", 44));

		// Sorting using age

//		Collections.sort(person,new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge().compareTo(o2.getAge());
//			}
//		});

		// Collections.sort(person, (o1, o2) -> o1.getAge().compareTo(o2.getAge()));

		// Collections.sort(person, (o1,o2)-> o1.getName().compareTo(o2.getName()));

		// Sorting using stream

		List<Person> p = person.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		List<Person> p1 = person.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		System.out.println(p1);

	}

}
