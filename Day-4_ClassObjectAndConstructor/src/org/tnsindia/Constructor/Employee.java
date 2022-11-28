package org.tnsindia.Constructor;

public class Employee {

	public static void main(String[] args) {
		Employee()
		{
			System.out.println("Default constructor");
		}
		//parameterized constructor
		public Employee(int salary, String name) {
			super();
			this.salary = salary;
			this.name = name;
			
			
		}
		//method
		public void print()
		{
			System.out.println("The salary of "+name+" is: "+salary);
		}
		
		
		
		

	

	}

}
