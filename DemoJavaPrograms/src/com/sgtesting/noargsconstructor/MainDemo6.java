package com.sgtesting.noargsconstructor;


class Fruits
{
	String name;
	String color;
	int priceperkg;
	String origincountry;
	Fruits()
	{
		name="Kiwi";
		color="Green";
		origincountry="Newzealand";
		priceperkg=300;

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
	Vegetables()
	{
		name="tomatto";
		color="Red";
		benefit="vitamin c";
		priceperkg=10;

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
	Flowers()
	{
		name="Sunflower";
		color="yellow";
		origincountry="usa";
		priceperkg=100;

		System.out.println("Flower Name is:" + name);
		System.out.println("Flower color is:" + color);
		System.out.println("Flower origin country is:" + origincountry);
		System.out.println("Flower Priceper kg is:" + priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");

	}



}

public class MainDemo6 {

	public static void main(String[] args) {
		Fruits obj=new Fruits();
		Vegetables obj1=new Vegetables();
		Flowers obj3=new Flowers();



	}

}

