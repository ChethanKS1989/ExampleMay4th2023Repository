package com.sgtesting.parameterizedconstructor;


class Desktop
{
	String brand;
	String ram;
	String rom;
	String size;
	Desktop(String Brand, String Ram,String Rom, String Size)
	{
		brand=Brand;
		ram=Ram;
		rom=Rom;
		size=Size;

		System.out.println("Desktop brand is:" +brand);
		System.out.println("Desktop ram is:" + ram);
		System.out.println("Desktop rom is:" + rom);
		System.out.println("Desktop size is:" + size);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}
class Laptop
{
	String brand;  
	String ram;
	String rom;
	String size;
	Laptop(String Brand, String Ram,String Rom, String Size)
	{
		brand=Brand;
		ram=Ram;
		rom=Rom;
		size=Size;

		System.out.println("Laptop brand is:" +brand);
		System.out.println("Laptop ram is:" + ram);
		System.out.println("Laptop rom is:" + rom);
		System.out.println("Laptop size is:" + size);
		System.out.println("++++++++++++++++++++++++++++++++");


	}
}

class Mobile
{
	String brand; 
	String ram;
	String rom;
	String size;
	Mobile(String Brand, String Ram,String Rom, String Size)
	{
		brand=Brand;
		ram=Ram;
		rom=Rom;
		size=Size;

		System.out.println("Mobile brand is:" + brand);
		System.out.println("Mobile ram is:" + ram);
		System.out.println("Mobile rom is:" + rom);
		System.out.println("Mobile size is:" +size);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class Assignment4 {

	public static void main(String[] args) {
		Desktop obj=new Desktop("Lenovo","1gb","2Tb","45inches");
		Laptop obj1=new Laptop("Hp","2gb","5Tb","55inches");
		Mobile obj3=new Mobile("MI","5gb","8Tb","75inches");;




	}

}
