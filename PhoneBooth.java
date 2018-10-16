class Call{
	int baseCharge = 1;

	int calcCharge(int duration){
		return baseCharge*duration;
	}
}

class OrdinaryCall extends Call{}

class UrgentCall extends Call{
	
	private int urgentCallCharge = 1;
	
	int calcCharge(int duration){
		return (baseCharge + urgentCallCharge)*duration;
	}
}

class LightningCall extends Call{

	 private int lightningCallCharge = 2;

	int calcCharge(int duration){
		return (baseCharge + lightningCallCharge)*duration;
	} 
}

public class PhoneBooth{

	public static void main(String args[]){

		int duration = 10;

		OrdinaryCall ord = new OrdinaryCall();
		int cost_ord = ord.calcCharge(duration);

		UrgentCall urg = new UrgentCall();
		int cost_urg = urg.calcCharge(duration);

		LightningCall lig = new LightningCall();
		int cost_lig = lig.calcCharge(duration);

		System.out.println(cost_ord);
		System.out.println(cost_urg);
		System.out.println(cost_lig);
	}
}