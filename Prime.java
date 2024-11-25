public class Prime {
    public static void main(String[] args) {
        int num = 29; // Number to check if it's prime
        boolean isPrime = true; // Flag to track primality

        // Check divisibility for numbers from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false; // Set isPrime to false if divisible
                break; // Exit the loop as we've found a divisor
            }
        }

        // Print result based on primality check
        if (isPrime) {
            System.out.println(num + " is definitely a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
