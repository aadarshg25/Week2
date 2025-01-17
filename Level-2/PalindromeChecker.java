import java.util.Scanner;

class IsPalindrome {
    String text;

    IsPalindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        text = text.toLowerCase();
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String to check for Palindrome (Not Case Sensitive ): ");
        String string = input.next();

        IsPalindrome string1 = new IsPalindrome(string.trim());
        boolean isPalindrome = string1.isPalindrome();

        if (isPalindrome) {
            System.out.println(string + " is a Palindrome.");
        } else {
            System.out.println(string + " is not a Palindrome.");
        }
        input.close();
    }
}
