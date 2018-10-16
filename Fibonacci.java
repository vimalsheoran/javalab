public class Fibonacci{
    
    public static void main(String args[]){
        
        int seriesLength = Integer.parseInt(args[0]);
        int n1 = 0, n2 = 1;
        
        for(int i = 0; i <= seriesLength; i++){
            if(i == 0){
                System.out.println(1);
            } else{
                int n = n1 + n2;
                System.out.println(n);
                n1 = n2;
                n2 = n;
            }
        }
    }
}