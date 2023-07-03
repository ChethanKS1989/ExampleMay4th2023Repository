package com.sgtesting.Conoverloding;

class Flower
{
	Flower(String name)
	{
		System.out.println("Flowername:"+name);
	}
	Flower(int ppkg)
	{
		System.out.println("Priceperkg:"+ppkg);
	}
}
public class Codemo3 {

	public static void main(String[] args) {
		Flower o1=new Flower("Rose");
		Flower o2=new Flower(256);
	}

}

