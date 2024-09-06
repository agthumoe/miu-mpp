package lesson3.labs.prob1;

public class PersonWithJob {

	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public String getName() {
		return person.getName();
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		this.salary = s;
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.person.getName()==p.getName() &&
				this.salary==p.salary;
		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
