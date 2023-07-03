package com.sgtesting.Conchaining;

class Product
{
	Product(int prodno,String prodname)
	{
		System.out.println("Prodno:"+prodno);
		System.out.println("Prodname:"+prodname);
	}
	Product(int quantity)
	{
		this(23,"shampoo");
		System.out.println("Quantity:"+quantity);
	}
	
}
public class CCdemo4 {

	public static void main(String[] args) {
		Product o1=new Product(256);
		
	}

}

