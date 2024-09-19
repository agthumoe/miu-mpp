import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Problem1 {

	public static void main(String[] args) {
		// To understand functions as First class citizen
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Function<Integer, Double> parseDouble = (i -> i * 2.0d);
		Consumer<Integer> consumer = (i -> System.out.println(i * 2.0d));
		numbers.forEach((i) -> consumer.accept(i));
		// Task 1: Identify the suitable interface to read the input and print doubled
		// changeDouble(numbers /* , Functional Interface implementation*/ );// Output:
		// 2 4 6 8 10

		List<String> data = Arrays.asList("apple", "banana", "cherry");
		data.forEach((s) -> System.out.println(s.toUpperCase()));
		// Task 2: Take input of String and transform into Upper case
		// transformStrings(data /*, Functional Interface implementation*/);

		// Task 3: Check the inputs of given value is divisible by 5.
		List<Integer> inputs = Arrays.asList(10, 21, 12, 25, 33);
		// printIf(inputs /*, Functional Interface implementation*/);
		inputs.forEach((d) -> {
			if (d % 5 == 0) {
				System.out.println(d);
			}
		});
	}
}
