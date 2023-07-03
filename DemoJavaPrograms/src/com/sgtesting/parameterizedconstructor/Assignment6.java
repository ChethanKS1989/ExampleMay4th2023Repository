package com.sgtesting.parameterizedconstructor;



class Fruits
{
	String name;
	String color;
	int priceperkg;
	String origincountry;
	Fruits(String Name, String Color, int PPkg, String Ogco)
	{
		name=Name;
		color=Color;
		origincountry=Ogco;
		priceperkg=PPkg;

		System.out.println("Fruit Name is:" + name);
		System.out.println("Fruit color is:" + color);
		System.out.println("Fruit origin country is:" + origincountry);
		System.out.println("Fruit per kg is:" + priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}
class Vegetables
{
	String name;
	String color;
	int priceperkg;
	String benefit;
	Vegetables(String Name, String Color, int PPkg, String Benefit)
	{
		name=Name;
		color=Color;
		benefit=Benefit;
		priceperkg=PPkg;

		System.out.println("Vegetable Name is:" + name);
		System.out.println("Vegetable color is:" +color);
		System.out.println("Vegetable rich in:" + benefit);
		System.out.println("Vegetable priceperkg is:" + priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

class Flowers
{
	String name;
	String color;
	int priceperkg;
	String origincountry;
	Flowers(String Name, String Color, int PPkg, String Ogco)
	{
		name=Name;
		color=Color;
		origincountry=Ogco;
		priceperkg=PPkg;

		System.out.println("Flower Name is:" + name);
		System.out.println("Flower color is:" + color);
		System.out.println("Flower origin country is:" + origincountry);
		System.out.println("Flower Priceper kg is:" + priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");

	}



}

public class Assignment6 {

	public static void main(String[] args) {
		Fruits obj=new Fruits("Kiwi","Red",25,"India");
		Vegetables obj1=new Vegetables("Carrot","Red",25,"India");
		Flowers obj3=new Flowers("Rose","Red",25,"India");



	}

}

