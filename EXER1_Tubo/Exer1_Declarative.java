import java.util.Arrays;
import java.util.List;

public class Exer1_Declarative {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Declarative: describe the desired outcome
        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)   // keep only even numbers
                         .mapToInt(Integer::intValue)
                         .sum();                    // sum them up

        System.out.println("Sum of even numbers: " + sum);
    }
}