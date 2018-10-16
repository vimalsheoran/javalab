public class CLCalculator{
    
    public static void main(String args[]){
        
        int leftArg = Integer.parseInt(args[0]);
        String operator = args[1];
        int rightArg = Integer.parseInt(args[2]);
        
        switch(operator){
            case "+":
                System.out.println(leftArg + rightArg);
                break;
            case "-":
                System.out.println(leftArg - rightArg);
                break;
            case "*":
                System.out.println(leftArg * rightArg);
                break;
            case "/":
                System.out.println(leftArg / rightArg);
                break;
            case "^":
                int prod = 1;
                for(int i = 0; i < rightArg; i++){
                    prod *= leftArg;
                }
                System.out.println(prod);
                break;
            default:
                System.out.println("Invalid usecase");
                break;
        }
    }
}