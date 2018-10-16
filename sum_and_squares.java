public class SquareOfTenNums{
    
    public static void main(String args[]){
        
        int sum = 0;
        System.out.println("Squares of numbers:");
        for(int i = 0; i < 10; i++){
            System.out.println(Integer.parseInt(args[i]) * Integer.parseInt(args[i]));
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum of numbers: ");
        System.out.println(sum);
    }
}