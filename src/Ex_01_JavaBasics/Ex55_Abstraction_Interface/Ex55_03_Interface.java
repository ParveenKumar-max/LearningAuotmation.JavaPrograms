package Ex_01_JavaBasics.Ex55_Abstraction_Interface;

public class Ex55_03_Interface {

    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.drive();
        // We are created the OBJECT of car, While implements the Interface class, you are eligible to modify the method.
        //
    }

}


class Car1 implements Engine1, Brakes{


    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}




interface Brakes{  // Interface --> class, Incomplete Class
    void applyBreak(); // Method , you can say, Incomplete Method
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){ // All these method are incomplete method.
        System.out.println("concrete complete");
    }

}