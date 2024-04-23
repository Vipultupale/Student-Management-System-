package com.studentmanagemrnt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
			public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					List<Student>studentList=new  ArrayList<Student>();
					int count = 0;
					
					while(true) {
						if(count!=0) {
							System.out.println("DO YOU WANT TO CONTINUE \n 'THEN PRESS THE ' YES '  ");
							String countinues=sc.next();
							if(countinues.equalsIgnoreCase("yes")) {
								
							}
							else {
								System.exit(0);	
							}
						}
						
						
					 System.out.println("STUDENT MANAGEMENT PROJECT");
					 System.out.println("---------------------------------------------------------");
					 System.out.println("1.add Student \n"
							 +"2.update student \n"
							 +"3.display all student \n"
							 + "4.delete student\n"
							 + "5.exit\n");
					 System.out.println("select the options");
					 int option = sc.nextInt();
					 //switch for particular option
					 switch(option) {
					 case 1:
						 //add student
						 Student student =  Studentutility.addStudent();
						 studentList.add(student);
						 System.out.println("student details added ");
						 break;
						 
					 case 2:
						 //update student
						 Studentutility.Updatestudent(studentList);
						 break;
					 case 3:
						 //display all the student
						 Studentutility.displayAllStudent(studentList);
						 break;
						 
					 case 4:
						 //delete student 
						 System.out.println("Delete student option");
						 System.out.println("enter the student id");
						 int sID =sc.nextInt();
						 Studentutility.deleteStudent(studentList, sID);
						 break;
						 
					 case 5:
						 //exit
						 System.exit(0);
						 break;
						 
					default :
						System.err.println("choice the current option");
					 }
			        }
}
}
