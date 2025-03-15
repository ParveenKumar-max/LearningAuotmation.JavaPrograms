package Ex_01_JavaBasics;

public class Ex16_IncreDecre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); // 11+11+12=34
        System.out.println(a);
// Remember one thing
        // Exp a= 1+10=11, so a is 11
        // Exp a=11+1=12, so a is 11 but value of A increase to 12
        // Exp a=12+1=13, so a is 13

        int b = 20;
        System.out.println(--b + b++ + b--); // 19+19+20=58
        System.out.println(b);

        // Exp b=1-20=19, Value of b is 19
        // Exp b=19+1=20, b is 19, but value of b increased to 20
        // Exp b=20-1=19, b is 19m but

    }
}
