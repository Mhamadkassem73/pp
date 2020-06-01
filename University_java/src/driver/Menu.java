package driver;

import java.util.ArrayList;
import java.util.Scanner;

import courseManagement.Course;
import Individuals.*;

public class Menu {
	
	public static ArrayList<Course> courses;
	public static ArrayList<Student> students;
	public static ArrayList<Instructor> instructors;
	public static Scanner in = new Scanner(System.in);
	
	public static int GetTheChoice(){
		int choice;
		System.out.println("1 - Add instructor");
		System.out.println("2 - Add Course");
		System.out.println("3 - Assign an course to an instructor");
		System.out.println("4 - Add Student");
		System.out.println("5 - Register a student to a course");
		System.out.println("6 - print List of instructors");
		System.out.println("7 - print List of courses taught by instructors");
		System.out.println(" ---------------------------------");
		System.out.println("Enter your choice");
		choice = in.nextInt();
		return choice;
	}
	
	public static void AddInstructor(){
		String name;
		int age;
		double salary;
		boolean choice;
		Instructor i;
		
		System.out.println("---------------------------");
		System.out.println("You will add a new instructor");
		System.out.println("---------------------------");
		System.out.println("enter his name:");
		name =  in.next();
		System.out.println("enter his age: ");
		age = in.nextInt();
		i = new Instructor(name, age);
		System.out.println("the basic salary is 1000$; would you like to change it? (true/false)");
		choice = in.nextBoolean();
		if(choice == true){
			System.out.println("enter the new salary: ");
			salary = in.nextDouble();
			i.setSalary(salary);
		}
		
		instructors.add(i);
	}
	
	public static void AddCourse(){
		String code, name;
		Course c;
		System.out.println("---------------------------");
		System.out.println("You will add a new course");
		System.out.println("---------------------------");
		System.out.println("enter the code:");
		code =  in.next();
		System.out.println("enter the title: ");
		name = in.next();
		c = new Course(code,name);
		courses.add(c);
	}
	
	public static int VerifyTheCourseCode(String code){
		int i;
		for(i=0 ; i < courses.size(); i ++){
			if(courses.get(i).getCode().equals(code))
				return i;
		}
		
		return -1;
	}
	public static int VerifyTheInstructorName(String name){
		int i;
		for(i=0 ; i < instructors.size(); i ++){
			if(instructors.get(i).getName().equals(name))
				return i;
		}
		
		return -1;
	}
	
	public static void AssignCourseToInstructor(){
		String code, name;
		int posCourse, posInstructor;
		System.out.println("The list of available courses is:");
		for(int i = 0; i < courses.size(); i ++)
			System.out.println(courses.get(i));
		System.out.println("---------------------------------");
		System.out.println("enter the course code : ");
		code = in.next();
		while( (posCourse = VerifyTheCourseCode(code)) == -1);
		
		System.out.println("The list of available instructors is:");
		for(int i = 0; i < instructors.size(); i ++)
			System.out.println(instructors.get(i));
		System.out.println("---------------------------------");
		System.out.println("enter the instructor name : ");
		name = in.next();
		
		while( (posInstructor = VerifyTheInstructorName(name)) == -1);
		
		courses.get(posCourse).setTeacher(instructors.get(posInstructor));
		
		
		
		
		
	}
	
	
	
	public static void PrintListOfInstructors(){
		for(int i = 0; i < instructors.size(); i++){
			System.out.println(instructors.get(i));
			System.out.println("####################");
		}
	}
	
	public static void PrintTaughtCourses(){
		for(int i = 0 ; i < instructors.size(); i ++){
			System.out.println(instructors.get(i));
			instructors.get(i).printTaughtCourses();
		}
			
	}
	
	
	public static void main (String [] a){
		
		int choice;
		boolean repeat = true;
		
		
		
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
		instructors =  new ArrayList<Instructor>();
		
		
		while(repeat){
			choice = GetTheChoice();
			switch(choice){
			case 1:  AddInstructor();
					break;
			case 2 : AddCourse();
					break;
			case 3: AssignCourseToInstructor();
					break;
			case 6 : PrintListOfInstructors();
					break;
			case 7 : PrintTaughtCourses();
					break;
			default: repeat = false;
					break;
			}
		}
		
		
		
	}
}
