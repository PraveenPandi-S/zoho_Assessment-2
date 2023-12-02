package Todaytest;
import java.util.Scanner;

public class ReverseFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        displayReverseFibonacci(n);

        scanner.close();
    }

    public static void displayReverseFibonacci(int n) {
        int[] fibonacci = new int[n + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Reverse Fibonacci Series:");

        for (int i = n; i >= 0; i--) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}






	


