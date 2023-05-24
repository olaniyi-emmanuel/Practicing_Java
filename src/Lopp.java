import java.util.Scanner;

public class Lopp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myInput;


        do {
            System.out.print("Enter an integer between 1 and 10: ");
            myInput=input.nextInt();
        }
        while (myInput<1 || myInput>10);
        System.out.println("Your input is between 1 and 10 ");

    }
}
