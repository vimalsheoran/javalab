public class Largest{
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if(x > y && x > z){
            System.out.println("The largest number is " + x);
        } else{
            if(y > z){
                System.out.println("The largest number is " + y);
            } else{
                System.out.println("The largets number is " + z);
            }
        }
    }
}
