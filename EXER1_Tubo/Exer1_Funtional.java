import java.util.Arrays;
import java.util.List;

public class Exer1_Funtional {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Functional: no mutable state, uses pure functions
        int sum = numbers.stream()
                         .filter(Exer1_Funtional::isEven)   // pure function
                         .reduce(0, Integer::sum);            // pure reduction

        System.out.println("Sum of even numbers: " + sum);
    }

    // Pure function: same input → same output, no side effects
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}