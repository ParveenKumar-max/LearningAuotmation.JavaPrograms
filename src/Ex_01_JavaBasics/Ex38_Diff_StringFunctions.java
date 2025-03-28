package Ex_01_JavaBasics;

public class Ex38_Diff_StringFunctions {
    public static void main(String[] args) {

        // Different StringBuffer Functions
        // Because it's synchronised, mutable and Thread-safe

        // 1. Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer);

        // 2. Append(String s) : Add text at the end.

        StringBuffer stringBuffer1 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer1.append("_Append Function"));
        stringBuffer1.insert(1,"_Insert Function");

        // 3. insert(int 1, String s)

        StringBuffer stringBuffer2 = new StringBuffer("Parveen Kumar");
        StringBuffer value3= stringBuffer2.insert(13,"_Insert Function");
        // It will add _insert Function on 15 position.
        System.out.println(value3);

        // 4. replace(int start, int end, String s)
        // Using replace function--> Kumar replaces with Chaudhary

        StringBuffer stringBuffer3 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer3.replace(8,13,"Chaudhary"));

        // 5. Delete(int 1, int 2)
        // In this function, first we delete it and then append it.

        StringBuffer stringBuffer4 = new StringBuffer("Parveen Kumar");
        StringBuffer value5 = stringBuffer4.delete(8,13);
        System.out.println(value5.append("Chaudhary"));

        // 6. Reverse --> it reverse the given String

        StringBuffer stringBuffer5 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer5.reverse());

        // 7 . capacity() --> Return the capacity of the buffer

        StringBuffer stringBuffer6 = new StringBuffer("Parveen Kumar");
        stringBuffer6.ensureCapacity(100);
        System.out.println(stringBuffer6.capacity());


        // 8 . ensureCapcity(int minCapacity)

        StringBuffer stringBuffer7 = new StringBuffer("Parveen Kumar");
        stringBuffer7.ensureCapacity(100);
        System.out.println(stringBuffer7.capacity());

        // 9 . charAT(int 10) --> Returns the value you entered in parameters

        StringBuffer stringBuffer8 = new StringBuffer("Parveen Kumar");
        char value9  = stringBuffer8.charAt(8);
        System.out.println(value9);

        // 10 . length --> Count the length of the String

        StringBuffer stringBuffer9 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer9.length());
        System.out.println(stringBuffer9.substring(2));

        // 11 . subString(int String) --> Extract a substring

        StringBuffer stringBuffer10 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer9.substring(2));  // it will return you only 1 string
        System.out.println(stringBuffer9.substring(8,13));  // it will return you character from 8 to 13

        // 12. toString() --> Converts StringBuffer to String

        StringBuffer stringBuffer11 = new StringBuffer("Parveen Kumar");
        System.out.println(stringBuffer11.toString());

        // 13. trimtoSize() --> Reduce capactiy to fit the current content

        StringBuffer stringBuffer12 = new StringBuffer(50);
        StringBuffer value13 = stringBuffer12.append("Parveen Kumar");
        value13.trimToSize();
        System.out.println(value13
        );









    }
}
