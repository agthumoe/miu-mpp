package lab9.prob8;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("Query 1");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println(" ==== end of Query 1 ====");

        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Query 2");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .forEach(System.out::println);
        System.out.println(" ==== end of Query 2 ====");

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("Query 3");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> "Cambridge".equals(t.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct() // does not specifically mention in the query to sort, but I did it anyway
                .forEach(System.out::println);
        System.out.println(" ==== end of Query 3 ====");
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("Query 4");
        transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .distinct() // does not specifically mention in the query to sort, but I did it anyway
                .forEach(System.out::println);
        System.out.println(" ==== end of Query 4 ====");

        System.out.println("Query 5");
        // Query 5: Are there any trader based in Milan?
        boolean isExist = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> "Milan".equals(t.getCity()))
                .findFirst()
                .isPresent();
        System.out.println(isExist ? "Yes" : "No");
        System.out.println(" ==== end of Query 5 ====");

        System.out.println("Query 6");
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> "Milan".equals(t.getCity()))
                .forEach(t -> t.setCity("Cambridge"));
        System.out.println(transactions);
        System.out.println(" ==== end of Query 6 ====");
        
        // Query 7: What's the highest value in all the transactions?
        System.out.println("Query 7");
        transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .ifPresent((x) -> System.out.println("Highest value in all transactions: " + x));
        System.out.println(" ==== end of Query 7 ====");
    }
}
