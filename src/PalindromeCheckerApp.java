public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Stores a predefined string
        String input = "radar";
        boolean isPalindrome = true;

        // 2. Compares characters from both ends
        // Hint: Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            char startChar = input.charAt(i);
            char endChar = input.charAt(input.length() - 1 - i);

            if (startChar != endChar) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }

        // 3. Determines and displays the result
        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a palindrome.");
        }
    }
}
