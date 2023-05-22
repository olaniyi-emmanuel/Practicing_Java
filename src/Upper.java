import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        System.out.print("Enter your score: ");
        Scanner myGrade = new Scanner(System.in);
        int myNewGrade = myGrade.nextInt();
        switch (myNewGrade){
            case 10:
                System.out.println("Your grade is F");
                break;
            case 20:
                System.out.println("Your grade is D");
                break;
            case 30:
                System.out.println("Your grade is C");
                break;
            case 40:
                System.out.println("Your grade is B");
                break;
            case 50:
                System.out.println("Your grade is A");
            default:
                System.out.println("Invalid score");
        }
    }
}
