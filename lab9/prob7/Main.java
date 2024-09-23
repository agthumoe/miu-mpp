package lab9.prob7;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static lab9.prob7.LambdaLibrary.EMPLOYEES_WITH_HIGH_SALARY;
import static lab9.prob7.LambdaLibrary.EMPLOYEES_WITH_HIGH_SALARY_IN_NAMES_RANGE;

public class Main {
	private static final String chars = "NOPQRSTUVWXYZ";

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		// problem 7 (a)

		System.out.println(list.stream()
				.filter(e -> e.getSalary() > 100000)
				.filter(e -> chars.contains(e.getLastName().substring(0, 1)))
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.sorted()
				.collect(Collectors.joining(", ")));

		// problem 7 (b)
		System.out.println(EMPLOYEES_WITH_HIGH_SALARY.apply(list, 100000));
		System.out.println(EMPLOYEES_WITH_HIGH_SALARY_IN_NAMES_RANGE.apply(list, 100000, chars));
	}

}
