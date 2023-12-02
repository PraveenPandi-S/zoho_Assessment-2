package Todaytest;
import java.util.Scanner;
public class Pyramid {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
              for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
             System.out.println();
        }
    }
}
