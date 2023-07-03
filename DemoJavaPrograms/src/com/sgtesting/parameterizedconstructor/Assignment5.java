package com.sgtesting.parameterizedconstructor;



class Country
{
	String name;
	String capital;
	String population;
	String area;
	Country(String Name,String Capital, String Population, String Area)
	{
		name=Name;
		capital=Capital;
		population=Population;
		area=Area;

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
	State(String Name,String Capital, String Population, String Area)
	{
		name=Name;
		capital=Capital;
		population=Population;
		area=Area;


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
	District(String Name,String Capital, String Population, String Area)
	{
		name=Name;
		capital=Capital;
		population=Population;
		area=Area;
		System.out.println("District Name is:" + name);
		System.out.println("District Capital is:" + capital);
		System.out.println("District population is:" + population);
		System.out.println("District area is:" + area);
		System.out.println("++++++++++++++++++++++++++++++++");

	}

}

public class Assignment5 {

	public static void main(String[] args) {
		Country obj=new Country("india","Delhi","25000","23sq.cm");
		State obj1=new State("Karnataka","Bengaluru","2300","63sq.cm");
		District obj3=new District("Hassan","Arsiker","3600","56sq.cm");



	}

}


