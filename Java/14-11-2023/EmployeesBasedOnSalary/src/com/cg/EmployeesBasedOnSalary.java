package com.cg;

import java.util.Arrays;
import java.util.Comparator;

class EmployeesBasedOnSalary {
	String name;
	int salary;

	public EmployeesBasedOnSalary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
	}

	public static void main(String[] args) {
		
		EmployeesBasedOnSalary[] employees = {
				new EmployeesBasedOnSalary("John", 50000), 
				new EmployeesBasedOnSalary("Alice", 60000), 
				new EmployeesBasedOnSalary("Bob", 40000),
				new EmployeesBasedOnSalary("Charlie", 30000) };
		
		Arrays.sort(employees, Comparator.comparingInt(EmployeesBasedOnSalary::getSalary));
		System.out.println(Arrays.toString(employees));
	}
}
