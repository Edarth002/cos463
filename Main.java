public class Main {
    public static int reverseDigit(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverseDigit(12345)); 
        System.out.println("Reversed: " + reverseDigit(67890)); 
    }
}
