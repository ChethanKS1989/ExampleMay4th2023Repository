package com.sgtesting.in;

interface States
{
	void showstatesname(String name);
}
interface Districts
{
	 void ShowDistrictsname(String name);
}
abstract class Taluk 
{
	public void showstatesname(String name)
	{
		System.out.println("states name:"+name);
	}
	public void ShowDistrictsname(String name)
	{
		System.out.println("Distric name:"+name);
	}
	public void showtalukname(String name)
	{
		System.out.println("Taluk name:"+name);
	}
}
class village extends Taluk implements Districts,States
{
	public void showstatesname(String name)
	{
		System.out.println("states name:"+name);
	}
	public void ShowDistrictsname(String name)
	{
		System.out.println("Distric name:"+name);
	}
	public void showtalukname(String name)
	{
		System.out.println("Taluk name:"+name);
	}
	public void showVillagename(String name)
	{
		System.out.println("village name:"+name);
	}
}
	
public class A2 {

	public static void main(String[] args) {
		village o=new village();
		o.ShowDistrictsname("tumkur");
		o.showstatesname("karnataka");
		o.showtalukname("cn halli");
	    o.showVillagename("t.halli");
		

	}

}

