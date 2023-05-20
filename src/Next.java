import java.util.Scanner;

public class Next {
    //Read the user's favourite number (doble, int,...) and then display it in a message of choice
    public static void main(String[] args) {
        Scanner userFavouriteNumber = new Scanner(System.in);
        System.out.print("Enter your favourite number ");
        System.out.println("Your favourite number is " + userFavouriteNumber.nextDouble());

    }

}
