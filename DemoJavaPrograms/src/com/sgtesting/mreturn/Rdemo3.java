package com.sgtesting.mreturn;
class Cnumber
{
	int count()
	{
		int count=0;
		for(int i=100;i<200;i++)
		{
		if(i%7==0)
		{
			count+=1;
		}
		}
		return count;
		
	}
}


public class Rdemo3 {

	public static void main(String[] args) {
		Cnumber o=new Cnumber();
		int x=o.count();
		System.out.println(x);
	}

}
