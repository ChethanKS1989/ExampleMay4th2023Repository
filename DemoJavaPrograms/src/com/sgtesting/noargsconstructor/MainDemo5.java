package com.sgtesting.noargsconstructor;


class Country
{
	String name;
	String capital;
	String population;
	String area;
	Country()
	{
		name="India";
		capital="Delhi";
		population="130cr";
		area="275595 sq m";

		System.out.println("Country Name is:" + name);
		System.out.println("Country Capital is:" + capital);
		System.out.println("Country population is:" + population);
		System.out.println("Country area is:" + area);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}
class State
{
	String name;
	String capital;
	String population;
	String area;
	State()
	{
		name="karnataka";
		capital="Bangalore";
		population="8cr";
		area="2595 sq m";

		System.out.println("State Name is:" + name);
		System.out.println("State Capital is:" + capital);
		System.out.println("State population is:" + population);
		System.out.println("State area is:" + area);
		System.out.println("++++++++++++++++++++++++++++++++");


	}

}

class District
{
	String name;
	String capital;
	String population;
	String area;
	District()
	{
		name="Tumkur";
		capital="Tumkur";
		population="50lakhs";
		area="279 sq m";

		System.out.println("District Name is:" + name);
		System.out.println("District Capital is:" + capital);
		System.out.println("District population is:" + population);
		System.out.println("District area is:" + area);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class MainDemo5 {

	public static void main(String[] args) {
		Country obj=new Country();
		State obj1=new State();
		District obj3=new District();



	}

}


