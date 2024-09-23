package lesson9.lecture.streamandoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
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
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female candidates names
	Stream.of(list)
			.filter(human -> "Female".equals(human.getGender()))
			.map(Human::getName)
			.forEach(System.out::println);
	

    /* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new. 
                 Then print the object status */
	Function<String, Human> humanSupplier1 = Human::new;
	Human human1 = humanSupplier1.apply("Alice");

	BiFunction<String, Integer, Human> humanSupplier2 = Human::new;
	Human human2 = humanSupplier2.apply("Bob", 40);

	TriFunction<String, Integer, String, Human> humanSupplier3 = Human::new;
	Human human3 = humanSupplier3.apply("Charlie", 25, "Male");

	// Query 3 : Count the male candidates whose age is more than 30
	long maleCount = Stream.of(list)
			.filter(human -> "Male".equals(human.getGender()) && human.getAge() > 30)
			.count();
	System.out.println("Number of males older than 30: " + maleCount);
	
}



}