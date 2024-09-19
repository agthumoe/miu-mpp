import java.util.Arrays;
import java.util.List;

public class problem4 {

    public static void main(String[] args) {
        String[] names = { "Alexis", "Tim", "Kyleen", "Kristy" };

        // a. Use Arrays.sort() to sort the names by ignore case using Method reference.
        Arrays.sort(names, String::compareToIgnoreCase);

        // b. Convert the sorted array into a List.
        List<String> nameList = Arrays.asList(names);

        // c. Print the sorted list using method reference
        nameList.forEach(System.out::println);
    }
}
