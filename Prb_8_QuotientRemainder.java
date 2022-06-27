package Java_Basic_Progms;
import java.util.Scanner;

public class Prb_8_QuotientRemainder {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Insert the Numerator ");
        int numerator =num.nextInt();
        System.out.print("Insert the  Denominator");
        int denominator = num.nextInt();
        double remainder = numerator % denominator;
        System.out.println("Remainder is :" + remainder);
        double quotient = numerator / denominator;
        System.out.println(" Quotient is :" + quotient);
    }
}
