package com.sgtesting.Conchaining;



class Department
{
	Department(int code,String deptname)
	{
		System.out.println("Code:"+code);
		System.out.println("Departmentname:"+deptname);
	}
	Department(int deptcount)
	{
		this(23,"CSE");
		System.out.println("Deptcount:"+deptcount);
	}
	
}
public class CCdemo1 {

	public static void main(String[] args) {
		Department o1=new Department(256);
		
	}

}