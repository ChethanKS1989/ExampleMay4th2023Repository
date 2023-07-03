package com.sgtesting.ab;
abstract class Shop
{
    abstract void ShowShopName(String Name);
    abstract void ShowShopPincode(int Pincode);
}
class Shop1 extends Shop
{
	void ShowShopName(String Name)
	{
		System.out.println("Name:"+Name);
	}
	void ShowShopPincode(int id)
	{
		System.out.println("Id:"+id);
	}
}
class Shop2 extends Shop1
{
	void Shop(String Adress)
    {
    	System.out.println("Adress:"+Adress);
    }
	void Shopy(int code)
    {
       System.out.println("Code:"+code);	
    }
}

public class A4{
	
	public static void main(String[] args) {
		Shop2 obj=new Shop2();
		obj.ShowShopName("Boss");
		obj.ShowShopPincode(56437);
		obj.Shop("tdv");
		obj.Shopy(1234);
		
		
		
		

	}

}



