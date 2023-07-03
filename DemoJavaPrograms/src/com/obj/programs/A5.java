package com.obj.programs;
class Jx
{
	String productname;
	void show1()
	{
		System.out.println("in product class,productname:"+productname);
	}
	
}
class Kx extends Jx
{
	String productname;
	Kx(String prodname1,String prodname2)
	{
		super.productname=prodname1;
		this.productname=prodname2;
	}
	void show2()
	{
		System.out.println("in order class,productname:"+productname);
	}
	
}
class Lx extends Kx
{
	String productname;
	Lx(String prodname1,String prodname2,String prodname3)
	{
		super(prodname1,prodname2);
		this.productname=prodname3;
	}
	void show3()
	{
		System.out.println("in shipping class,productname:"+productname);
	}
	
}
public class A5 {

	public static void main(String[] args) {
		Lx o=new Lx("Samsung","Lenova","Dell");
		o.show1();
		o.show2();
		o.show3();
		
		
	}

}
