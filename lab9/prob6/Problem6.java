package lab9.prob6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem6 {
    public static void main(String[] args) {
        List<Set<String>> list = List.of(
                Set.of("A", "B"),
                Set.of("D"),
                Set.of("1", "3", "5"));
        Problem6 p = new Problem6();
        System.out.println(p.union(list));
    }

    public Set<String> union(List<Set<String>> sets) {
        return sets.stream()
                .reduce(new HashSet<>(), (x, y) -> {
                    x.addAll(y);
                    return x;
                });
    }
}
