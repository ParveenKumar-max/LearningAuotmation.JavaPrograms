package Ex_01_JavaBasics;

public class Ex10_LogicalOperator {

    public static void main(String[] args) {
        // Logical operator

   // && (And) , OR (||) and !: (NOT)

        int a = 20 , b = 30;
         boolean  c = true;
        if (a > 50 && b > 10 ){
            System.out.println("Both Conditions are true");
        }else {
            System.out.println("Values are wrong");
        }

        if (a > 50 || b > 10 ){
            System.out.println("Both Conditions are true");
        }else {
            System.out.println("Values are wrong");
        }

        if (a < 50 || !c){
            System.out.println("Both Conditions are true");
        }else {
            System.out.println("Values are wrong");
        }


    }
}
