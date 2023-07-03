package com.obj.programs;
class Country
{
	String name;
	String capital;
	String population;
	String area;

}
class State
{
	String name;
	String capital;
	String population;
	String area;

}

class District
{
	String name;
	String capital;
	String population;
	String area;


}

public class MainDemo5 {

	public static void main(String[] args) {
		Country obj=new Country();
		obj.name="India";
		obj.capital="Delhi";
		obj.population="130cr";
		obj.area="275595 sq m";

		System.out.println("Country Name is:" + obj.name);
		System.out.println("Country Capital is:" + obj.capital);
		System.out.println("Country population is:" + obj.population);
		System.out.println("Country area is:" + obj.area);
		System.out.println("++++++++++++++++++++++++++++++++");
		State obj1=new State();
		obj1.name="karnataka";
		obj1.capital="Bangalore";
		obj1.population="8cr";
		obj1.area="2595 sq m";

		System.out.println("State Name is:" + obj1.name);
		System.out.println("State Capital is:" + obj1.capital);
		System.out.println("State population is:" + obj1.population);
		System.out.println("State area is:" + obj1.area);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		District obj3=new District();
		obj3.name="Tumkur";
		obj3.capital="Tumkur";
		obj3.population="50lakhs";
		obj3.area="279 sq m";

		System.out.println("District Name is:" + obj3.name);
		System.out.println("District Capital is:" + obj3.capital);
		System.out.println("District population is:" + obj3.population);
		System.out.println("District area is:" + obj3.area);
		System.out.println("++++++++++++++++++++++++++++++++");



	}

}


