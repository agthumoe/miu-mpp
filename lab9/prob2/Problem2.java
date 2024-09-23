package lab9.prob2;

import java.util.stream.IntStream;

public class Problem2 {

    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, i -> i + 1)
                .map(i -> i * i)
                .limit(num)
                .forEach(System.out::println);
    }
}
