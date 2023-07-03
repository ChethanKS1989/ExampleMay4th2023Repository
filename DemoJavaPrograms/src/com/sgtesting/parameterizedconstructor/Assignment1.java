package com.sgtesting.parameterizedconstructor;




class Employee
{
	String employeename;
	int empid;
	int empsalary;
	int age;
	Employee(String empname,int empno, int empsal, int Age )
	{
		employeename=empname;
		empid=empno;
		age=Age;
		empsalary=empsal;
		System.out.println("Empname:"+employeename);
		System.out.println("Empno:"+empid);
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
	Department(String Deptname, int deptno, String Depthead, int Deptcount)
	{
		deptname=Deptname;
		deptid=deptno;
		depthead= Depthead;
		deptcount=Deptcount;
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
	Insurance(String Insname, int Insno, int Matamount, String Matdate)
	{
		insname=Insname;
		insno=Insno;
		matamount=Matamount;
		matdate=Matdate;
		System.out.println("Insname:"+insname);
		System.out.println("Insno:"+insno);
		System.out.println("Matamount:"+matamount);
		System.out.println("Matdate:"+matdate);
	}
}



public class Assignment1 {

	public static void main(String[] args) {
		Employee obj1=new Employee("Chethan",123, 25000,35);
		Employee obj2=new Employee("Charan",523, 55000,25);
		Department obj3=new Department("CSE",23, "Chandan",2);
		Department obj4=new Department("ISE",24, "Chinthan",5);
		Insurance obj5=new Insurance("Medical", 2356, 25000, "25/03/2023");
		Insurance obj6=new Insurance("Vehicle", 5356, 55000, "26/03/2023");

	}
}



