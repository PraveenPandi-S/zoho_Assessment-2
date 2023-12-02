package Todaytest;
import java.util.Scanner;
public class Pyramid {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input = scanner.nextInt();
        int cap = input - 1;
        int increment = 1;  // This variable is used to determine the pattern for each row
        
        for (int i = 1; i <= input; i++) {
            // Print leading spaces
            for (int k = 1; k <= cap; k++) {
                System.out.print(" ");
            }
            
            int val = 1;
            // Print increasing numbers up to the center of the pyramid
            for (int l = cap + 1; l <= cap + increment; l++) {
                if (l < input) {
                    System.out.print(val);
                    val++;
                } else if (l == input) {
                    System.out.print(val);
                } else {
                    // Print decreasing numbers after reaching the center
                    --val;
                    System.out.print(val);
                }
            
}
        }
    }
}