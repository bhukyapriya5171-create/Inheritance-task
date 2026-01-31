package com.inheritance.task;

public class Employee {
	int salary=50000;
}
class Manager extends Employee {
	int bonus = 20000;
	

	public static void main(String[] args) {
		Manager m =new Manager();
		int totalsalary=m.salary+m.bonus;
		System.out.println("Total Salary" +totalsalary);
		
		
	}

}
