package Ex_01_JavaBasics;

public class Ex12_TableOfNine {
    public static void main(String[] args) {
        // Using PrintF
        int num = 9;
        System.out.printf("%d*1=%d%n", num, num*1);
        System.out.printf("%d*2=%d%n", num, num*2);
        System.out.printf("%d*3=%d%n", num, num*3);
        System.out.printf("%d*4=%d%n", num, num*4);
        System.out.printf("%d*5=%d%n", num, num*5);
        System.out.printf("%d*6=%d%n", num, num*6);
        System.out.printf("%d*7=%d%n", num, num*7);
        System.out.printf("%d*8=%d%n", num, num*8);
        System.out.printf("%d*9=%d%n", num, num*9);
        System.out.printf("%d*10=%d%n", num, num*10);

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }


    }
}
