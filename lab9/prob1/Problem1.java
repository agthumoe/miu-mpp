import java.util.List;

public class Problem1 {
  public static void main(String[] args) {
    Problem1 p = new Problem1();
    List<String> words = List.of("apple", "banana", "cherr", "duine", "elderberry", "fig", "grape");
    System.out.println(p.countWords(words, 'a', 'b', 5));
    System.out.println(p.countWords(words, 'u', 'g', 5));
    System.out.println(p.countWords(words, 'e', 'a', 5));
    System.out.println(p.countWords(words, 'l', 'g', 10));
  }

  public int countWords(List<String> words, char c, char d, int len) {
    return (int) words.stream()
        .filter(s -> s.length() == len)
        .filter(s -> s.contains(String.valueOf(c)))
        .filter(s -> !s.contains(String.valueOf(d)))
        .count();
  }
}
