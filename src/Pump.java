import java.util.Scanner;

public class Pump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the four digit number: ");
        int myNumber = input.nextInt();

        //4th digit
        int fourthDigit= myNumber%10;

        //3rd digit
        int thirdDigit = (myNumber%100)/10;

        //2nd digit
        int secondDigit = (myNumber%1000)/100;

        //1st number
        int firstDigit = myNumber/1000;

        //logic of lucky number
        if ((firstDigit + secondDigit) == (thirdDigit + fourthDigit))
            System.out.println("Winner, your entry is a lucky Number ");
        else
            System.out.println("Sorry, your number is not a lucky number");



    }
}
