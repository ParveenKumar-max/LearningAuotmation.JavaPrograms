package Ex_01_JavaBasics;

public class EX13_NestedTernary {
    public static void main(String[] args) {
        // Nested Ternary
        //String value = condition ? expression1 : (condition ? expression2 : expression3);
        // Find Max value
        int var1 = 2;
        int var2 = 10;
        int var3 = -40;
        System.out.println(Math.max(var1,var2));   // Math.max will only for two conditions

        // Logic Building Formula -- Print Max value
        // Step -- 1 --> What is your Input and Output
        // input -->  var1, var2, var3 and output is --> 2,10, -40, find max number

        // Step -- 2 --> Rough Logic
        // var1 > var2 and(&&) var1 > var3 --> var1
        // var2 > var3 and(&&) var2 > var1 -- var2
        // var3 > var2 and(&&) var3 > var1 --> False

 // (var1 > var2) ? ((var1 > var3) ? "Print var1" : "Print var3") : ((var2 > var3) ? "Print var2" : "Print var3");
 String Result = (var1 > var2) ? ((var1 > var3) ? "Print var1" : "Print var3") : ((var2 > var3) ? "Print var2" : "Print var3");
            System.out.println(Result);

// age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
//        // take an input from user  --- You can pass the argument in the Edit configuration --> Program Arguments
//String value = condition ? expression1 : (condition ? expression2 : expression3);

// age > 18 --> Adult, age < 18 --> Minor, age > 65 -- > Senior ( age<18->Minor, age<65:adult:senior
//(age < 18) ? "Minor" : (age < 65: "Adult" : "Senior")
        int age = 23;
        String Result2 = (age < 18) ? "Minor" : (age < 65 ? "Adult" : "Senior");
        System.out.println(Result2);
    }
}
