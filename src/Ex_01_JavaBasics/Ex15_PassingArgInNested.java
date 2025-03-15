package Ex_01_JavaBasics;

public class Ex15_PassingArgInNested {
    public static void main(String[] args) {
        // Take an input from Arguments

        String Get_input = args[0];
        // It's giving an error because we have stored value as String
        // Need to convert it in Integer. We have a function called
        // Integer.parasInt
        int Get_result1 = Integer.parseInt(Get_input);
        String Result = (Get_result1 > 34) ? "Print Get Input" : "It's an issue to Print value";
        System.out.println(Result);

        // Example with Increment operator

        int age =  10;
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(++age + --age + age++);
        System.out.println(--age);

    // Line 18 --> Exp->10+1=11, Value=11 , it will print 11 for line 18
    // Line 19 --> Exp->11=11, Value->11+1=12 , it will print 11, (because exp is 11 and age is 12) for line 19
    // Line 20 --> Exp->12+1=13, 13-1=12, 12+1=13  ,   it will print 13+12+12 = 37, exp is 12 &  age is 13 right now, for line 20
    // Line 21 --> Exp--> 13-1=12, it will print 10 for line 21


    }
}
