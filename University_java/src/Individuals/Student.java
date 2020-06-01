package Individuals;

import java.util.ArrayList;

import courseManagement.Course;

public class Student extends Person {
	private String ID;
	private static int c = 1000;
	private ArrayList<Course> ListOfRegisteredCourses;
	
	
	public Student(String name, int age){
		super(name, age);
		ID = "" + Name.charAt(0) + c;
		c ++;
		ListOfRegisteredCourses = new ArrayList<Course>();
	}
	
	public Student(String id, String name, int age){
		super(name, age);
		ID = id;
		ListOfRegisteredCourses = new ArrayList<Course>();
	}
	
	public String getID(){
		return ID;
	}
	
	public static int getCounter(){
		return c;
	}
	
	public static void setCounter(int c1){
		c = c1;
	}
	
	public void registerTo(Course c){
		this.ListOfRegisteredCourses.add(c);
		c.getSt().add(this);
	}
	
	public String toString(){
		return "ID : " + ID + " - " + super.toString();
	}
}
