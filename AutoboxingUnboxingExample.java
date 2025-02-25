import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
            System.out.println("Adding " + num + " to sum, current sum: " + sum);
        }
        return sum;
    }

    public static List<Integer> parseStringToIntegers(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            try {
                numbers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + str);
            }
        }
        System.out.println("Parsed numbers: " + numbers);
        return numbers;
    }

    public static void main(String[] args) {
        String[] strNumbers = { "10", "20", "30", "40", "50" };
        List<Integer> numbers = parseStringToIntegers(strNumbers);
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
