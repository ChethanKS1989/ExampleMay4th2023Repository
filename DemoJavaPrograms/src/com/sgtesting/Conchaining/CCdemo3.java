package com.sgtesting.Conchaining;

class Employee
{
	Employee(int empno,String empname)
	{
		System.out.println("Empno:"+empno);
		System.out.println("Empname:"+empname);
	}
	Employee(int age)
	{
		this(23,"Chethan");
		System.out.println("Age:"+age);
	}
	
}
public class CCdemo3 {

	public static void main(String[] args) {
		Employee o1=new Employee(23);
		
	}

}
