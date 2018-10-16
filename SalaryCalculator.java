class Worker{

	int baseAmount = 100;

	int comPay(int hoursPerWeek){
		return baseAmount*hoursPerWeek;
	}
}

class DailyWorker extends Worker{

	int baseAmount = 125;	
}

class SalariedWorker extends Worker{

	int comPay(int hoursPerWeek){
		return baseAmount*40;
	}
}

public class SalaryCalculator{

	public static void main(String args[]){

		DailyWorker raju = new DailyWorker();
		int salary_raju = raju.comPay(30);

		SalariedWorker kishore = new SalariedWorker();
		int salary_kishore = kishore.comPay(30);

		System.out.println(salary_raju);
		System.out.println(salary_kishore);
	}
}