package com.sgtesting.noargsconstructor;


class University
{
	String name;
	String code;
	String location;
	University()
	{
		name="VTU";
		code="vtubgm1";
		location="Belgaum";
		

		System.out.println("University Name is:" + name);
		System.out.println("University code is:" + code);
		System.out.println("University location s:" + location);		
		System.out.println("++++++++++++++++++++++++++++++++");

	}
	

}
class College
{
	String name;
	int rank;
	String location;
	String state;
	College()
	{
		name="Bnaglore university";
		rank=7;
		location="Bangalore";
		state="karnataka";

		System.out.println("College Name is:" + name);
		System.out.println("College rank is:" + rank);
		System.out.println("College location is:" + location);
		System.out.println("College loactaed in state is:" + state);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

class Student
{
	String name;
	String branch;
	int percentage;
	int studentid;
	Student()
	{
		name="kiran";
		branch="Mech";
		studentid=988654;
		percentage=98;

		System.out.println("Student Name is:" + name);
		System.out.println("Student branch is:" + branch);
		System.out.println("Student id  is:" + studentid);
		System.out.println("Student percentage is:" + percentage);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class MainDemo7 {

	public static void main(String[] args) {
		University obj=new University();
				College obj1=new College();
				
		Student obj3=new Student();
		


	}

}

