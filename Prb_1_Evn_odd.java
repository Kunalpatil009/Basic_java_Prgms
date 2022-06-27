package  Java_Basic_Progms;
import java.util.Scanner;

public class Prb_1_Evn_odd {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
                System.out.println("Please Enter The Number:");
                int number = num.nextInt();
                if (number % 2 == 0) {
                    System.out.println("The No. is Even");
                }
                else {
                    System.out.println("The No. is Odd");
                }
            }


}
