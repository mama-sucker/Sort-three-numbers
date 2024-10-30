
// Module 6 Excercise 6.5

// Imports 
import java.util.Arrays;
import java.util.Scanner;

public class S3n {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sort three numbers program!");
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

    
        displaySortedNumbers(num1, num2, num3);

        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        System.out.println("here are you numbers in increasing order:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
