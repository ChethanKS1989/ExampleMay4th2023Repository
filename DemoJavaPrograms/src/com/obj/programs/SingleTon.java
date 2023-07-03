package com.obj.programs;
class Employee51
{
	static Employee51 obj=null;
	private Employee51()
	{
		
	}
	void name(String name)
	{
		System.out.println("EmployeeName:"+name);
	}
	void Bonus(String name,int increment)
	{
		System.out.println("BonusName"+name);
		System.out.println("BonusIncrement:"+increment);
	}
	static Employee51 getInstance()
	{
		if(obj==null)
		{
			obj=new Employee51();
		}
		return obj;
	}
	
}

public class SingleTon {

	public static void main(String[] args) {
		Employee51 o1=Employee51.getInstance();
		o1.name("suman");
		o1.Bonus("DeepavaliBonus",5000);
		Employee51 o5=Employee51.getInstance();
		o5.name("ajit");
		o5.Bonus("DasaraBonus",6000);
		if(o1==o5)
		{
			System.out.println("All objects are having same refernce");
		}
		else
		{
			System.out.println("All objects are not having same refernce");
		}

	}

}


