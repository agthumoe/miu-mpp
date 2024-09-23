package lab9.prob1;

import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "card", "dog", "candle", "cow", "car", "crane");

        int count = countWords(words, 'c', 'd', 3);
        System.out.println("Number of matching words: " + count);
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) != -1)
                .filter(word -> word.indexOf(d) == -1)
                .count();
    }
}
