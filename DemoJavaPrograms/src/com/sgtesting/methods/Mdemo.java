package com.sgtesting.methods;

class Table
{
	void multiplictaion(int num)
	{
	
		for(int i=1;i<=10;i++)
		{
			String val=num+"*"+i+"= "+(i*num);
			System.out.println(val);
		}
		
	}
	
}

public class Mdemo {

	public static void main(String[] args) {
		Table o1=new Table();
		o1.multiplictaion(10);
			}

}
