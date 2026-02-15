package inheritanceatask;

public class Employee {
	String name;
	  double baseSalary;
	  public Employee(String name, double baseSalary) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
	  }
	  double calculateAnnualSalary() {
	        return baseSalary;
	    }
}

class Manager extends Employee{
	double bonus;
    int numberOfEmployeesManaged;


    public Manager(String name, double baseSalary, double bonus, int numberOfEmployeesManaged) {
		super(name, baseSalary);
		this.bonus = bonus;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}


	double calculateManagerSalary() {
        return baseSalary + bonus;
    

	}	
}
class Engineer extends Employee {
    int projectCount;

    Engineer(String name, double baseSalary, int projectCount) {
        super(name, baseSalary);
        this.projectCount = projectCount;
    }

    double calculateEngineerSalary() {
        return baseSalary + (projectCount * 1000);
    }
}
class Salesperson extends Employee {
    double commissionRate;
    double totalSales;

    Salesperson(String name, double baseSalary, double commissionRate, double totalSales) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    double calculateSalespersonSalary() {
        return baseSalary + (commissionRate * totalSales);
    }
}
