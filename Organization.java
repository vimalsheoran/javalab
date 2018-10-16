class Employee{

	String name;
	int empId;
	double salary;

	Employee(String name, int empId, double salary){
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	String getEmpName(){
		return this.name;
	}

	double getEmpSalary(){
		return this.salary;
	}

	void increaseSalary(double percentageIncrease){
		double increment = (percentageIncrease * salary) / 100;
		this.salary += increment;
	}
}

class Manager extends Employee{

	String department = "";

	Manager(String name, int empId, double salary, String department){
		super(name, empId, salary);
		this.department = department;
	}
}

public class Organization{

	public static void main(String args[]){

		Employee emp = new Employee("Arjun", 1120, 35000.00);

		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.empId);

		emp.increaseSalary(7.5);

		System.out.println(emp.salary);

		Manager mang = new Manager("Vikram", 1020, 55000.00, "finance");
		System.out.println(mang.department);
	}
}