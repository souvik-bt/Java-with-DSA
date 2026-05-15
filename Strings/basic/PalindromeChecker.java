package Strings.basic;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Initialize pointers at the start and end of the string
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer forward if current character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer backward if current character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters after converting to lowercase
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }
        return true; // No mismatches found
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(test)); // Output: true
    }
}
