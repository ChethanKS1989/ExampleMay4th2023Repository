package com.sgtesting.in;

interface  Product
{
	void showproductname(String name);
}
interface order extends Product
{
	void showordername(String name);
}
class Samsung implements Product,order
{
	public void showproductname(String name) 
	{
		System.out.println("productname:"+name);
	}
	public void showordername(String name)
	{
		System.out.println("order name:"+name);
	}
}
public class A3 {

	public static void main(String[] args) {
     Samsung o=new Samsung();
     o.showproductname("mobile phone");
     o.showordername("abcd");

	}

}
