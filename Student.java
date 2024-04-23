package com.studentmanagemrnt;

public class Student {
	private int studentID;
	private String studentname;
	private int studentage;
	
	
	public Student() {
		super();
	}
	public Student(int studentID, String studentname, int studentage) {
		super();
		this.studentID = studentID; 
		this.studentname = studentname;
		this.studentage = studentage;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage( int studentage) {
		this.studentage = studentage;
	}
	
	@Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentname='" + studentname + '\'' +
                ", studentage=" + studentage +
                '}';
				}
	
}
