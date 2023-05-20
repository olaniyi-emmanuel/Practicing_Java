import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Taking the full name of the user
        Scanner userFullName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is " + userFullName.nextLine());

        //Taking the age of the user

        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int newUserAge =userAge.nextInt();
        System.out.println("You are  " + newUserAge + "years old");

        //Taking the gender of the user
        Scanner userGender = new Scanner(System.in);
        System.out.print("Enter your Gender Male_or_Female: ");
        System.out.println("Your current chosen gender is " + userGender.nextLine());

        //Taking the height of the user
        Scanner userHeight = new Scanner(System.in);
        System.out.print("Enter your height in meters : ");
        System.out.println("Your current height is " + userHeight.nextLine());





    }


}