package Individuals;

import java.util.ArrayList;

import courseManagement.Course;

public class Instructor extends Person {
		private double Salary = 1000;
		private ArrayList<Course> ListOfTaughtCourses;
		
		public Instructor(String name, int age){
			super(name,age);
			this.ListOfTaughtCourses = new ArrayList<Course>();
		}
		
		public void setSalary(double salary){
			Salary = salary;
		}
		
		public ArrayList<Course> getLTC(){
			return this.ListOfTaughtCourses;
		}
		
		public double getSalary(){
			return Salary;
		}
		
		public void printTaughtCourses(){
			for(int i = 0 ; i < ListOfTaughtCourses.size(); i ++)
				System.out.println(this.ListOfTaughtCourses.get(i));
		}
}
