package Ex_01_JavaBasics;

public class Ex47_PyramidProgram {

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                for (int j = 9; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}

