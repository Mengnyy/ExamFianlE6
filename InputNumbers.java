import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to enter: ");
        int numElements = scanner.nextInt();
        int[] numbers = new int[numElements];
        System.out.println("Enter " + numElements + " integers:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The input numbers are:");
        for (int i = 0; i < numElements; i++) {
            System.out.println((i+1) + ". " + numbers[i]);
        }
        scanner.close();
    }
}