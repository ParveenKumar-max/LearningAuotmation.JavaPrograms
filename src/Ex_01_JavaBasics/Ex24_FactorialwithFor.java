package Ex_01_JavaBasics;

public class Ex24_FactorialwithFor {
    public static void main(String[] args) {
        int factorial = 1; // Initialize the factorial variable to 1
        int number = 10;   // Initialize the number variable to 10
        if (number <= 0) { // If true, print the factorial (which is 1)
            System.out.println(factorial);
        } else {            // If the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number; i++) {     // Loop from 1 to the number
                factorial = factorial * i;  // Multiply the current factorial value by i
            }
        }
        System.out.println("Factorial" + " " + factorial); // Print the calculated factorial
    }
}


/*
How it works -->
        1 = 1 *1 --> 1 -- Condition true, i++ , i =2, number = 10, Factrial = 1
        1 = 1 * 2 --> 2 -- Condition true, i++ , i =3, number = 10, Factorial = 2
        2 = 2 * 3 --> 6 -- Condition true, i++ , i =4, number = 10, Factorial = 6
        6 = 6 * 4 --> 24  -- Condition true, i++ , i =5, number = 10, Factorial = 24
        24 = 24 * 5 -- 120  -- Condition true, i++ , i =6, number = 10, Factorial = 120
        120 = 120 * 6 -- 720  -- Condition true, i++ , i =7, number = 10, Factorial = 720
        720 = 720 * 7 -- 5040  -- Condition true, i++ , i =8, number = 10, Factorial = 5040
        5040 = 5040 * 8 -- 40320  -- Condition true, i++ , i =9, number = 10, Factorial = 40320
        40320 = 40320 * 9 -- 362880  -- Condition true, i++ , i =10, number = 10, Factorial = 362880
        362880 = 362880 * 10 -- 3628800  -- Condition false, i++ , i =11, number = 10, Factorial = 3628800*/