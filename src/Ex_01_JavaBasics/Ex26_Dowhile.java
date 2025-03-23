package Ex_01_JavaBasics;

public class Ex26_Dowhile {
    public static void main(String[] args) {
         // while statement
        int count = 0;
        int age = 40;
        while(age < 50){
            System.out.println("Age is less than");
            age++;
        }
        // do while

        do {
            System.out.println("Execute First then check the conditions......Rarely used" +" "+ count );
            age++;
            count++;
        }while(age < 50);
    }
}
