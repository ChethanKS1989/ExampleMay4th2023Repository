package com.obj.programs;
class Fruits
{
	String name;
	String color;
	int priceperkg;
	String origincountry;

}
class Vegetables
{
	String name;
	String color;
	int priceperkg;
	String benefit;

}

class Flowers
{
	String name;
	String color;
	int priceperkg;
	String origincountry;



}

public class MainDemo6 {

	public static void main(String[] args) {
		Fruits obj=new Fruits();
		obj.name="Kiwi";
		obj.color="Green";
		obj.origincountry="Newzealand";
		obj.priceperkg=300;

		System.out.println("Fruit Name is:" + obj.name);
		System.out.println("Fruit color is:" + obj.color);
		System.out.println("Fruit origin country is:" + obj.origincountry);
		System.out.println("Fruit per kg is:" + obj.priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");
		Vegetables obj1=new Vegetables();
		obj1.name="tomatto";
		obj1.color="Red";
		obj1.benefit="vitamin c";
		obj1.priceperkg=10;

		System.out.println("Vegetable Name is:" + obj1.name);
		System.out.println("Vegetable color is:" + obj1.color);
		System.out.println("Vegetable rich in:" + obj1.benefit);
		System.out.println("Vegetable priceperkg is:" + obj1.priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Flowers obj3=new Flowers();
		obj3.name="Sunflower";
		obj3.color="yellow";
		obj3.origincountry="usa";
		obj3.priceperkg=100;

		System.out.println("Flower Name is:" + obj3.name);
		System.out.println("Flower color is:" + obj3.color);
		System.out.println("Flower origin country is:" + obj3.origincountry);
		System.out.println("Flower Priceper kg is:" + obj3.priceperkg);
		System.out.println("++++++++++++++++++++++++++++++++");



	}

}

