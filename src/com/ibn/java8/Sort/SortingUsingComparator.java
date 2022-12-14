package com.ibn.java8.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{

	private String name;
	private Integer age;

	public Employee() {
	}

	public Employee(String name, Integer age) {
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
		return "Employee [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.age - o.getAge();
//	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}
	

}

public class SortingUsingComparator {
	
	public static void main(String[] args) {
		        
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ibney", 31));
		emp.add(new Employee("Hashim", 34));
		emp.add(new Employee("MohdAli", 20));
		emp.add(new Employee("Rizwan", 40));
		emp.add(new Employee("Salik", 30));
		emp.add(new Employee("Firoj", 10));
		emp.add(new Employee("Gufran", 44));
		
		//Sorting using age
		Collections.sort(emp);
		System.out.println(emp);
		
		//Sorting using stream
		List<Employee> s1 = emp.stream().sorted(Comparable::compareTo).collect(Collectors.toList());
		
		System.out.println(s1);
	}

}
