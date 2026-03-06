import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // 1. Convert string to character array
        char[] charArray = input.toLowerCase().toCharArray();

        // 2. Initialize start and end pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // 3. Compare characters efficiently
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            start++; // Move start pointer forward
            end--;   // Move end pointer backward
        }

        // 4. Display the result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: Valid Palindrome (Character Array Method)");
        } else {
            System.out.println("Result: Not a Palindrome");
        }

        scanner.close();
    }
}