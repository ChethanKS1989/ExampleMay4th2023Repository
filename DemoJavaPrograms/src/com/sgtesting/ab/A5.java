package com.sgtesting.ab;
abstract class Country
{
	abstract void ShowCountryName(String Name);
    abstract void ShowCountryIdnum(int Idnum);
}
class State extends Country
{
	void ShowCountryName(String Name)
	{
		System.out.println("State Name:"+Name);
	}
	void  ShowCountryIdnum(int Idnum)
	{
		System.out.println("State Idnum:"+Idnum);
	}
}
class State2 extends Country
{
	void ShowCountryName(String Name)
	{
		System.out.println("District Name:"+Name);
	}
	void ShowCountryIdnum(int Idnum)
	{
		System.out.println("District Zipcode:"+Idnum);
	}
}
class Taluk extends State2
{
	void Taluk(String Name)
	{
		System.out.println("Taluk Name:"+Name);
	}
	void Taluk(int id)
	{
		System.out.println("Taluk Id:"+id);
	}
}
public class A5 {

	public static void main(String[] args) {
		Taluk o=new Taluk();
		o.Taluk("CB Pura");
		o.Taluk(12345);
		 
		State ob=new State();
		ob.ShowCountryName("India");
		ob.ShowCountryIdnum(+91);
	}

}
