package basicjava;
import java.util.Scanner; // use of 'Scanner' class gotten from https://www.w3schools.com/java/java_user_input.asp

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner userAsk = new Scanner(System.in);
        System.out.println("Enter the first side length");

        String Num1 = userAsk.nextLine();

        Scanner userAsk2 = new Scanner(System.in);
        System.out.println("Enter the second side length");

        String Num2 = userAsk2.nextLine();



        int Hypotenuse = java.lang.Math.sqrt((Num1^2)+(Num2^2)); // current issue is that Num1 and Num2 are String types

        System.out.println("The hypotenuse is " + (Hypotenuse));




    }
}
