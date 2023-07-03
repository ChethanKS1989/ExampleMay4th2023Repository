package com.sgtesting.noargsconstructor;


class Desktop
{
	String brand;
	String ram;
	String rom;
	String size;
	Desktop()
	{
		brand="Lenovo";
		ram="4GB";
		rom="1TB";
		size="32inch";

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
	Laptop()
	{
		brand="hp";
		ram="8GB";
		rom="2TB";
		size="28inch";

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
	Mobile()
	{
		brand="MI";
		ram="16GB";
		rom="256gb";
		size="8inch";

		System.out.println("Mobile brand is:" + brand);
		System.out.println("Mobile ram is:" + ram);
		System.out.println("Mobile rom is:" + rom);
		System.out.println("Mobile size is:" +size);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class MD4 {

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		Laptop obj1=new Laptop();
		Mobile obj3=new Mobile();




	}

}



