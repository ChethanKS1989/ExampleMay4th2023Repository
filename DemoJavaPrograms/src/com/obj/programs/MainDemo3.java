package com.obj.programs;

class Product
{
	String prodname;
	int prodid;
	int quantity;
	int prodprice;
}

class Customer
{
	String custname;
	int custid;
	String custaddress;
	String custphoneno;
}
class Order
{
	int orderid;
	int quantity;
	String date;
	int paymentid;

}



public class MainDemo3 {

	public static void main(String[] args) {
		Product obj1=new Product();
		obj1.prodname="Headphone";
		obj1.prodid=456;
		obj1.quantity=25;
		obj1.prodprice=2200;
		System.out.println("Pname:"+obj1.prodname);
		System.out.println("Pid:"+obj1.prodid);
		System.out.println("Quantity:"+obj1.quantity);
		System.out.println("Pprice:"+obj1.prodprice);
		System.out.println("+++++++++++++++++++");
		Customer obj2=new Customer();
		obj2.custname="Charan";
		obj2.custid=890;
		obj2.custaddress="#b22,Arsikere";
		obj2.custphoneno="9844883636";
		System.out.println("Custname:"+obj2.custname);
		System.out.println("custid:"+obj2.custid);
		System.out.println("custaddress:"+obj2.custaddress);
		System.out.println("Cphno:"+obj2.custphoneno);
		System.out.println("+++++++++++++++++++");
		Order obj3=new Order();
		obj3.orderid=2569;
		obj3.quantity=25;
		obj3.paymentid=897;
		obj3.date="24/05/2023";
		System.out.println("OID:"+obj3.orderid);
		System.out.println("Quantity:"+obj3.quantity);
		System.out.println("date:"+obj3.date);
		System.out.println("Paymentid:"+obj3.paymentid);
	}
}

