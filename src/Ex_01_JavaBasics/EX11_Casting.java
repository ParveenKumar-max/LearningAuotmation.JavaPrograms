package Ex_01_JavaBasics;

public class EX11_Casting {
    public static void main(String[] args) {
        // Type Casting -- Widening & Narrowing (Both Implicit and Explicit)

            int var1 = 10;
            byte var2 = (byte)var1;  // Narrowing explicit

           long var3 = 234567l;
           float var4 = (float)var3;

    int var5 = 20;
    float var6 = 2.345f;
    float var7 = (var5+(float)var6);
    // Range is same which means is Narrowing, chances fo data loss is higher
    // and its clearly visible in the above example


        System.out.println(var2);
        System.out.println(var4);
        System.out.println(var7);
    }
}
