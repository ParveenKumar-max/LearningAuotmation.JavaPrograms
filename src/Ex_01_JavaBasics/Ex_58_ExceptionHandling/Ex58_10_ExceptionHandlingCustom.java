package Ex_01_JavaBasics.Ex_58_ExceptionHandling;

import java.util.Scanner;

public class Ex58_10_ExceptionHandlingCustom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value");
        try {
            // perform banking operations
            String value1 = scanner.next();
            double value2 = scanner.nextDouble();
            double value3 = scanner.nextDouble();
            processTransaction(value1, value2, value3);
        } catch (BankingException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Error Code is: " + e.getErrorCode());
        }finally {
            System.out.println("Thank You for your Transaction!. We will get back to you soon");
            scanner.close();
        }
    }

    private static void processTransaction(String accountType, double balance, double amount) throws BankingException {
        try {
            if (!accountType.equals("Savings") && !accountType.equals("Checking")) {
                throw new BankingException("Invalid Account Type ", 101);
            }
            if (balance < amount) {
                throw new BankingException("Insufficent Balnace", 102);
            }
            System.out.println("Transection Successful");
        } catch (BankingException e) {
            throw new BankingException("Transection Failed" + e.getMessage(), e.getErrorCode());
        }
    }
}

// Define a Custom Exception for Banking report
class BankingException extends Exception {

    private int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    // Create a constructor with errormessage and errorcode
    BankingException(String errormessage, int errorCode) {
        super(errormessage);
        this.errorCode = errorCode;

    }

}