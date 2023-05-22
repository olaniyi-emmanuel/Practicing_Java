import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myNewNumber = myNumber.nextInt();

        if (myNewNumber >10){
            System.out.println("Your number is greater than 10");

        } else if (myNewNumber==10) {
            System.out.println("Your number is equal to 10");
        }
        else {
            System.out.println("YOur number is less than 10");
        }


}}
