package lab9.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};
		List<Human> humanList = Arrays.asList(list);
		// Query 1  : Print only Female candidates names
		humanList.stream()
				.filter(x -> "Female".equals(x.getGender()))
				.forEach(System.out::println);

    	/* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new.
                 Then print the object status */
		Function<String, Human> createWithName = Human::new;
		BiFunction<String, Integer, Human> createWithNameAndAge = Human::new;
		TriFunction<String, Integer, String, Human> createWithNameAgeAndGender = Human::new;
		System.out.println(createWithName.apply("James"));
		System.out.println(createWithNameAndAge.apply("Peter", 31));
		System.out.println(createWithNameAgeAndGender.apply("Clark", 35, "Male"));

		// Query 3 : Count the male candidates whose age is more than 30
		System.out.println(humanList.stream()
				.filter(x -> "Male".equals(x.getGender()))
				.filter(x -> x.getAge() > 30)
				.count());

	}
}

@FunctionalInterface
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}
