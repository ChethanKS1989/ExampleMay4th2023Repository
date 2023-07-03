package com.sgtesting.noargsconstructor;

class Employee
{
	String employeename;
	int empid;
	int empsalary;
	int age;
	Employee()
	{
		employeename="chethan";
		empid=12;
		age=25;
		empsalary=60000;
		System.out.println("Empname:"+employeename);
		System.out.println("Empid:"+empid);
		System.out.println("Empage:"+age);
		System.out.println("Empsalary:"+empsalary);
		System.out.println("+++++++++++++++++++");

	}
}

class Department
{
	String deptname;
	int deptid;
	String depthead;
	int deptcount;
	Department()
	{
		deptname="CSE";
		deptid=12;
		depthead="Chandan";
		deptcount=6;
		System.out.println("Deptname:"+deptname);
		System.out.println("Deptid:"+deptid);
		System.out.println("Depthead:"+depthead);
		System.out.println("Deptcount:"+deptcount);
		System.out.println("+++++++++++++++++++");

	}
}
class Insurance
{
	String insname;
	int insno;
	int matamount;
	String matdate;
	Insurance()
	{
		insname="Medical";
		insno=12256;
		matamount=25000;
		matdate="25/05/2024";
		System.out.println("Insname:"+insname);
		System.out.println("Insno:"+insno);
		System.out.println("Matamount:"+matamount);
		System.out.println("Matdate:"+matdate);
	}
}



public class MainDemo1 {

	public static void main(String[] args) {
		Employee obj1=new Employee();
		Department obj2=new Department();
		Insurance obj3=new Insurance();

	}

}

