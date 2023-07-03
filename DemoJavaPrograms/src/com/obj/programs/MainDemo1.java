package com.obj.programs;
class Employee
{
	String employeename;
	int empid;
	int empsalary;
	int age;
}

class Department
{
	String deptname;
	int deptid;
	String depthead;
	int deptcount;
}
class Insurance
{
	String insname;
	int insno;
	int matamount;
	String matdate;
}

	
	
public class MainDemo1 {

	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.employeename="chethan";
		obj1.empid=12;
		obj1.age=25;
		obj1.empsalary=60000;
		System.out.println("Empname:"+obj1.employeename);
		System.out.println("Empid:"+obj1.empid);
		System.out.println("Empage:"+obj1.age);
		System.out.println("Empsalary:"+obj1.empsalary);
		System.out.println("+++++++++++++++++++");
		Department obj2=new Department();
		obj2.deptname="CSE";
		obj2.deptid=12;
		obj2.depthead="Chandan";
		obj2.deptcount=6;
		System.out.println("Deptname:"+obj2.deptname);
		System.out.println("Deptid:"+obj2.deptid);
		System.out.println("Depthead:"+obj2.depthead);
		System.out.println("Deptcount:"+obj2.deptcount);
		System.out.println("+++++++++++++++++++");
		Insurance obj3=new Insurance();
		obj3.insname="Medical";
		obj3.insno=12256;
		obj3.matamount=25000;
		obj3.matdate="25/05/2024";
		System.out.println("Insname:"+obj3.insname);
		System.out.println("Insno:"+obj3.insno);
		System.out.println("Matamount:"+obj3.matamount);
		System.out.println("Matdate:"+obj3.matdate);
	}

}
