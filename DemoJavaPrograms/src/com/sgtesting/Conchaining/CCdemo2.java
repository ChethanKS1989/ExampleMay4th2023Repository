package com.sgtesting.Conchaining;

class Insurance
{
	Insurance(int insno,String insname)
	{
		System.out.println("Insno:"+insno);
		System.out.println("Insname:"+insname);
	}
	Insurance(String matdate)
	{
		this(23,"Medical");
		System.out.println("Matdate:"+matdate);
	}
	
}
public class CCdemo2 {

	public static void main(String[] args) {
		Insurance o1=new Insurance("23/05/2023");
		
	}

}