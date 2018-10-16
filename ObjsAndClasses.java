class Car{
    
    int mileage;
    String modelNumber;
    
    void start(){
        System.out.println("Engine is on");
    }
    
    Car(int buildMileage, String buildModelNumber){
        mileage = buildMileage; //25;
        modelNumber = buildModelNumber; //"ag25ny67Q";
        System.out.println("Building a car.....");
        System.out.println("Car built!");
        System.out.println("Model number "+ modelNumber);
    }
    
    void stop(){
        System.out.println("Engine is off");
    }
}

public class ObjsAndClasses{
    
    public static void main(String args[]){
        
        Car myCar = new Car(25, "ag25ny67Q");
        myCar.start();
        myCar.stop();
    }
}