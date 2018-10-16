public class SquareArray{

	public static void main(String args[]){

		int [] squaredNums = new int[10];

		for(int i = 0; i < args.length; i++){
			int nonSquaredNum = Integer.parseInt(args[i]);
			int squaredNum = nonSquaredNum*nonSquaredNum;
			squaredNums[i] = squaredNum;
		}

		int sumOfSquares = 0;

		for(int i: squaredNums){
			sumOfSquares += i;
		}

		System.out.println(sumOfSquares);
	}
}