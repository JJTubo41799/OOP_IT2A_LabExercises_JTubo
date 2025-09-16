import java.util.Arrays;
import java.util.List;

public class Exer1_Imperative {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = 0; // mutable variable to store the running total

        // Explicitly loop through each number
        for (int num : numbers) {
            // Check if the number is even
            if (num % 2 == 0) {
                sum += num; // add it to the sum
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}