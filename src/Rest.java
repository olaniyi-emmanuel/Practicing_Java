import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        //Ask the user to input the required values
        System.out.println("Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int myFirstNumber = input.nextInt();
        System.out.print("Enter the second integer: ");
        int mySecondNumber = input.nextInt();
        System.out.print("Enter the operator: ");
        String operator = input.next();




        //Run the if-conditons here
        if (operator.equals("+"))
            System.out.println(myFirstNumber + mySecondNumber);
        else if (operator.equals("-")) {
            System.out.println(myFirstNumber - mySecondNumber);
        }
        else if (operator.equals("*")) {
            System.out.println(myFirstNumber * mySecondNumber);
        }
        else if (operator.equals("/")) {
            System.out.println(myFirstNumber / mySecondNumber);

        }
    }

}
