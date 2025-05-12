import java.util.Scanner;

public class palindromechecker {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " is a palindrome.");
        } else {
            System.out.println(inputNumber + " is not a palindrome.");
        }
    }
}
