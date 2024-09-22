package lab9.prob1;

import java.util.List;

public class Problem1 {
  public static void main(String[] args) {
    Problem1 p = new Problem1();

    List<String> words = List.of("cat", "card", "dog", "candle", "cow", "car", "crane");
    System.out.println(p.countWords(words, 'c', 'd', 3));
    System.out.println(p.countWords(words, 'a', 'd', 5));
    System.out.println(p.countWords(words, 'b', 'd', 5));
  }

  public int countWords(List<String> words, char c, char d, int len) {
    return (int) words.stream()
        .filter(s -> s.length() == len)
        .filter(s -> s.contains(String.valueOf(c)))
        .filter(s -> !s.contains(String.valueOf(d)))
        .count();
  }
}
