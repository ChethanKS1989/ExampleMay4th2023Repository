package com.obj.programs;
class Desktop
{
	String brand;
	String ram;
	String rom;
	String size;

}
class Laptop
{
	String brand;  
	String ram;
	String rom;
	String size;
}

class Mobile
{
	String brand; 
	String ram;
	String rom;
	String size;

}

public class MainDemo4 {

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.brand="Lenovo";
		obj.ram="4GB";
		obj.rom="1TB";
		obj.size="32inch";

		System.out.println("Desktop brand is:" + obj.brand);
		System.out.println("Desktop ram is:" + obj.ram);
		System.out.println("Desktop rom is:" + obj.rom);
		System.out.println("Desktop size is:" + obj.size);
		System.out.println("++++++++++++++++++++++++++++++++");
		Laptop obj1=new Laptop();
		obj1.brand="hp";
		obj1.ram="8GB";
		obj1.rom="2TB";
		obj1.size="28inch";

		System.out.println("Laptop brand is:" + obj1.brand);
		System.out.println("Laptop ram is:" + obj1.ram);
		System.out.println("Laptop rom is:" + obj1.rom);
		System.out.println("Laptop size is:" + obj1.size);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Mobile obj3=new Mobile();
		obj3.brand="MI";
		obj3.ram="16GB";
		obj3.rom="256gb";
		obj3.size="8inch";

		System.out.println("Mobile brand is:" + obj3.brand);
		System.out.println("Mobile ram is:" + obj3.ram);
		System.out.println("Mobile rom is:" + obj3.rom);
		System.out.println("Mobile size is:" + obj3.size);
		System.out.println("++++++++++++++++++++++++++++++++");




	}

}



