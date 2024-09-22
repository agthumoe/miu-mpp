package lab9.prob7;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
    private static final String chars = "NOPQRSTUVWXYZ";
    public static final BiFunction<List<Employee>, Integer, String> EMPLOYEES_WITH_HIGH_SALARY =
            (list, minSalary) -> list.stream()
                    .filter(e -> e.getSalary() > minSalary)
                    .filter(e -> chars.contains(e.getLastName().substring(0, 1)))
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .sorted()
                    .collect(Collectors.joining(", "));
    public static final TriFunction<List<Employee>, Integer, String, String> EMPLOYEES_WITH_HIGH_SALARY_IN_NAMES_RANGE =
            (list, minSalary, namesRange) -> list.stream()
                    .filter(e -> e.getSalary() > minSalary)
                    .filter(e -> namesRange.contains(e.getLastName().substring(0, 1)))
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .sorted()
                    .collect(Collectors.joining(", "));
}

@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
