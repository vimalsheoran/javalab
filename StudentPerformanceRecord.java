import java.util.Arrays;

public class StudentPerformace{
    
    public static void main(String args[]){
        
        Arrays.sort(args);
        
        for(int i = 0; i < 10; i++){
            if(Integer.parseInt(args[i]) >= 75){
                System.out.print(Integer.parseInt(args[i]));
                System.out.print("      ");
                System.out.print("DISTINCTION");
                System.out.println("");
            } else if(Integer.parseInt(args[i]) >= 51 && Integer.parseInt(args[i]) < 75){
                System.out.print(Integer.parseInt(args[i]));
                System.out.print("      ");
                System.out.print("MERIT");
                System.out.println("");
            } else if(Integer.parseInt(args[i]) >= 40 && Integer.parseInt(args[i]) < 51){
                System.out.print(Integer.parseInt(args[i]));
                System.out.print("      ");
                System.out.print("PASS");
                System.out.println("");
            } else{
                System.out.print(Integer.parseInt(args[i]));
                System.out.print("      ");
                System.out.print("FAIL");
                System.out.println("");
            }
        }
        
    }
}