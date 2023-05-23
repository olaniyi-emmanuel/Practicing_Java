import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 10: ");
        int myInput= input.nextInt();
        int i=3;


        while(myInput <1 || myInput >10) {
            System.out.println(myInput + ", Your number is not between 1 and 10, Try again");
            myInput= input.nextInt();
        }
        System.out.println("Great your number is between 1 and 10");

    }
}
