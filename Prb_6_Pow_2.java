package Java_Basic_Progms;
import java.util.Scanner;

public class Prb_6_Pow_2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter The number");
        for (int a = num.nextInt(); a <= 31; ++a) {
            for (int i = 1; i <= a; ++i) {
                System.out.println("Power Of 2 is " + i + "=" + 2 * i);
            }
        }
    }
}