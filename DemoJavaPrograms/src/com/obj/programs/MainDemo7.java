package com.obj.programs;
class University
{
	String name;
	String code;
	String location;
	

}
class College
{
	String name;
	int rank;
	String location;
	String state;

}

class Student
{
	String name;
	String branch;
	int percentage;
	int studentid;


}

public class MainDemo7 {

	public static void main(String[] args) {
		University obj=new University();
		obj.name="VTU";
		obj.code="vtubgm1";
		obj.location="Belgaum";
		

		System.out.println("University Name is:" + obj.name);
		System.out.println("University code is:" + obj.code);
		System.out.println("University location s:" + obj.location);		
		System.out.println("++++++++++++++++++++++++++++++++");
		College obj1=new College();
		obj1.name="Bnaglore university";
		obj1.rank=7;
		obj1.location="Bangalore";
		obj1.state="karnataka";

		System.out.println("College Name is:" + obj1.name);
		System.out.println("College rank is:" + obj1.rank);
		System.out.println("College location is:" + obj1.location);
		System.out.println("College loactaed in state is:" + obj1.state);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Student obj3=new Student();
		obj3.name="kiran";
		obj3.branch="Mech";
		obj3.studentid=988654;
		obj3.percentage=98;

		System.out.println("Student Name is:" + obj3.name);
		System.out.println("Student branch is:" + obj3.branch);
		System.out.println("Student id  is:" + obj3.studentid);
		System.out.println("Student percentage is:" + obj3.percentage);
		System.out.println("++++++++++++++++++++++++++++++++");



	}

}

