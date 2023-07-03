package com.sgtesting.noargsconstructor;


class Product
{
	String prodname;
	int prodid;
	int quantity;
	int prodprice;
	Product()
	{
		prodname="Headphone";
		prodid=456;
		quantity=25;
		prodprice=2200;
		System.out.println("Pname:"+prodname);
		System.out.println("Pid:"+prodid);
		System.out.println("Quantity:"+quantity);
		System.out.println("Pprice:"+prodprice);
		System.out.println("+++++++++++++++++++");
	}
}

class Customer
{
	String custname;
	int custid;
	String custaddress;
	String custphoneno;
	Customer()
	{
		custname="Charan";
		custid=890;
		custaddress="#b22,Arsikere";
		custphoneno="9844883636";
		System.out.println("Custname:"+custname);
		System.out.println("custid:"+custid);
		System.out.println("custaddress:"+custaddress);
		System.out.println("Cphno:"+custphoneno);
		System.out.println("+++++++++++++++++++");
	}
}
class Order
{
	int orderid;
	int quantity;
	String date;
	int paymentid;
	Order()
	{
		orderid=2569;
		quantity=25;
		paymentid=897;
		date="24/05/2023";
		System.out.println("OID:"+orderid);
		System.out.println("Quantity:"+quantity);
		System.out.println("date:"+date);
		System.out.println("Paymentid:"+paymentid);

	}

}



public class MainDemo3 {

	public static void main(String[] args) {
		Product obj1=new Product();
		Customer obj2=new Customer();
		Order obj3=new Order();
	}
}




