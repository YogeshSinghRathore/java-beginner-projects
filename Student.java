import java.util.Scanner;

public class PrimeInArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check and print prime numbers
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i]);
            }
        }
