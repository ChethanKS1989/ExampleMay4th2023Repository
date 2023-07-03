package com.sgtesting.Conoverloding;
class Customer
{
	Customer(String custname)
	{
		System.out.println("Customername:"+custname);
	}
	Customer(int custid)
	{
		System.out.println("Customernumber:"+custid);
	}
}
public class Codemo2 {

	public static void main(String[] args) {
		Customer o1=new Customer("charan");
		Customer o2=new Customer(256);
	}

}
