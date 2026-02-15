package inheritanceatask;

public class EmployeeMain {

	public static void main(String[] args) {
		 Employee manager = new Manager("Alice", 50000, 10000, 5);
	        System.out.println(manager.calculateAnnualSalary());
	        System.out.println(((Manager) manager).calculateManagerSalary());

	        Employee engineer = new Engineer("Bob", 70000, 5);
	        System.out.println(engineer.calculateAnnualSalary());
	        System.out.println(((Engineer) engineer).calculateEngineerSalary());

	        Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
	        System.out.println(salesperson.calculateAnnualSalary());
	        System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
	}

}
