package Ex_01_JavaBasics;

public class Ex22_ForLoop {
    public static void main(String[] args) {
        // Loop conditions
        int i;
        for (i = 0; i <= 10; i++) {

            System.out.println(i + " " + "Check");

        }
        for (int shruti = 0; shruti < 18; shruti++) { // 0 to 17, 18 times
            if (shruti > 15) {
                System.out.println("Gift from Papa, IPhone");
            } else {
                System.out.println("No Gift");
            }
        }

        int j = 70;
        for (j = 0; j <= 70; j++) {
            if (j % 2 == 0) {
                System.out.println("Even Value" + " " + j);
                continue;
            }
            if(j % 2 != 0) {
                System.out.println("Odd Number" + " " + j);
                break;

            }
        }
    }
}