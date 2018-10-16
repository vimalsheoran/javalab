public class SumOfRange{

	public static void main(String args[]){

		int sum = 0;
		for(int i = 40; i <= 250; i++){
			if(i%5 == 0){
				sum += i;
			} else{
				sum += 0;
			}
		}
		System.out.println(sum);
	}
}