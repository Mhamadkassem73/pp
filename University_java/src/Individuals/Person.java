
package Individuals;

public class Person {
	protected String  Name;
	protected int Age;
	
	public String getName(){
		return Name;
	}
	
	public int getAge(){
		return Age;
	}
	
	public Person(String name, int age){
		Name =  name;
		Age = age;
	}
	
	public String toString(){
		return "Name : " + Name + " - " + "Age :" + Age;
	}
}
