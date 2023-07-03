package com.sgtesting.parameterizedconstructor;



class University
{
	String name;
	String code;
	String location;
	University(String Name, String Code, String Location)
	{
		name=Name;
		code=Code;
		location=Location;
		

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
	College(String Name, int Rank, String Location, String State)
	{
		name=Name;
		rank=Rank;
		location=Location;
		state=State;

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
	Student(String Name, String Branch, int Percentage, int Studid)
	{
		name=Name;
		branch=Branch;
		studentid=Studid;
		percentage=Percentage;

		System.out.println("Student Name is:" + name);
		System.out.println("Student branch is:" + branch);
		System.out.println("Student id  is:" + studentid);
		System.out.println("Student percentage is:" + percentage);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class Assignment7 {

	public static void main(String[] args) {
		University obj=new University("VTU","23","Mysuru");
				College obj1=new College("RVCE",6,"bengaluru","karanataka");
				
		Student obj3=new Student("Abhi","CSE",25,65);
		


	}

}

