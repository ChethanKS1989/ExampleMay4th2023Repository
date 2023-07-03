package com.sgtesting.parameterizedconstructor;


	class Product
	{
		String prodname;
		int prodid;
		int quantity;
		int prodprice;
		Product(String Pname, int Pid, int Quantity, int Pprice)
		{
			prodname=Pname;
			prodid=Pid;
			quantity=Quantity;
			prodprice=Pprice;
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
		Customer(String Custname,int Custid,String Custaddress,String Cphno)
		{
			custname=Custname;
			custid=Custid;
			custaddress=Custaddress;
			custphoneno=Cphno;
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
		Order(int OID, int Quantity, String Date, int Paymentid)
		{
			orderid=OID;
			quantity=Quantity;
			paymentid=Paymentid;
			date=Date;
			System.out.println("OID:"+orderid);
			System.out.println("Quantity:"+quantity);
			System.out.println("date:"+date);
			System.out.println("Paymentid:"+paymentid);

		}

	}



	public class Assignment3 {

		public static void main(String[] args) {
			Product obj1=new Product("Phone",25,26,23);
			Customer obj2=new Customer("Bharath",25,"#b22/142","9844883636");
			Order obj3=new Order(23,256,"23/06/2022",2569);
		}
	}
