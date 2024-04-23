package com.studentmanagemrnt;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Studentutility {
	
	static  Scanner sc = new Scanner(System.in);

	//1.add student name
	public static Student addStudent() {
//		Student s = new Student();
		
		System.out.println("please enter  the student ID :- ");
		int id=sc.nextInt();

//		s.setStudentID(sc.nextInt()); 
		System.out.println("enter the student  name ");
		String name=sc.next();

//		s.setStudentname(sc.next());
		System.out.println("enter student age");
		int age=sc.nextInt();
//		s.setStudentage(sc.nextInt());	 
		Student s=new Student(id, name, age);
		
		return s;
	}
	//2.update student
	//list<student>students ???????
	public static  void Updatestudent(List<Student>students) {
		System.out.println("please enter the update and any other mistake edit here");
		System.out.println("enter the Studnet ID");
		int id =sc.nextInt();
		System.out.println("enter the Studnet name");
		String name =sc.next();
		System.out.println("enter the Studnet Age");
		int age = sc.nextInt();
		
		//done actual data after the update
		int count = 0;
			for(Student s : students) {
				if(id==s.getStudentID()) {
					System.out.println("enter the Id for edit " );
					int editID =sc.nextInt();
;					students.get(count).setStudentID(editID);
					break;
					}
				count++;
			}
			students.get(count). setStudentname(name);
			students.get(count).setStudentage(age);
	}
	
	
	//3.display student
		public static void displayAllStudent(List<Student>students) {
			Iterator <Student> studentIterator= students.iterator();
			
				while(studentIterator.hasNext()) {
				System.out.println  (studentIterator. next(). toString() );				
				}
		}
		//4.delete student
		public static void deleteStudent(List<Student> students , int sID) {
			Iterator<Student>studentIterator = students.iterator();
			while(studentIterator.hasNext()) {
				Student s =studentIterator.next();
				if(s.getStudentage() == sID) {
					studentIterator.remove();
						}
				}
			
		}
}


