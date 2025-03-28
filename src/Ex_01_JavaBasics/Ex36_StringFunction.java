package Ex_01_JavaBasics;

public class Ex36_StringFunction {
    public static void main(String[] args) {
        // Different String Function

        String name = "Parveen";
        System.out.println(name.length());   // String Have 7 character
        System.out.println(name.charAt(3));  // v char is present at 4 position (0 1 2 3 4 5 6 )

        // [P a r v e e n] -- So 10 is not present. Getting StringIndexOutOfBoundsException
       // System.out.println(name.charAt(10));


        // 2. concat()
        System.out.println(name.concat(" Chaudhary")); // Output --> Parveen Chaudhary

        // 3. contains()
        System.out.println(name.contains("om")); // Don't have "om" in parveen string -> False

        // 4. equals()
        System.out.println(name.equals("Parveen")); // Yes it's equal to Parveen -- True

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("parveen")); //Yes parveen is equal to Parveen -- True

        // 6. indexOf() //  parveen -> ? o
        System.out.println(name.indexOf('o')); // Print -1 as "o" is not present in Parveen

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); // -> It will print value of index 0 [0 1 2 3 4]

        // 7. length()
        System.out.println(name.length());  // // String Have 7 character

        // 8. replace( , )
        System.out.println(name.replace('n', 'N')); // it will replace 'n' to capital 'N'

        // 9. split()
        // This function break content in three part as we are using SPLIT function

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));  // This function pick index of 1,3 value.

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase()); // Print String in lower case

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());  // Print String in upper case

        // 14. startsWith()
        System.out.println(name.startsWith("P")); // Check it start with P -- True

        // 15. endsWith()
        System.out.println(name.endsWith("a")); // Check it start with a -- True

        // 16. trim()
        String name3 = "    Parveen Chaudhary     ";
        System.out.println(name3.trim());  // Remove the extra spaces.

        // 17. compareTo()
        System.out.println(name.compareTo("Parveen")); // Value is same --> Output 0

        // 18. contains - Validate input strings (e.g., check if a URL contains "http")
        // True -- If the sequence is found. String is case Sensitive, p and P is always matter, as per String it's not same

        String strvalue1 = "Parveen Kumar";
        String strvalue2 = new String("parveen kumar");
        System.out.println(strvalue1.contains("Parveen Kumar"));  // true
        System.out.println(strvalue2.contains("Parveen Kumar"));  // false



        // Below both function print variable value but in different way.
        StringBuilder stringBuilder = new StringBuilder("Parveen");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        // It will print the value between two string
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);  // In that case it will print full word -- PramodDutta

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);   // Print --> HelloJiWorld



        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d")); // Print --> 5
        System.out.println(n.lastIndexOf("d"));  // Print -> 6
        System.out.println(n.lastIndexOf("s")); // Print --> -1
        System.out.println(n.lastIndexOf("x")); // Without character --> Print -1



    }
}
