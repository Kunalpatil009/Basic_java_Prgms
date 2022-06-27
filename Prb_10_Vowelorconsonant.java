package  Java_Basic_Progms;
import java.util.Scanner;

public class Prb_10_Vowelorconsonant {
    public static void main(String[] args) {

        Scanner vc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char ch = vc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println((ch) + " is a Vowels");
        }
        else {
            System.out.println((ch) + " is a Consonents");
    }
}
}
