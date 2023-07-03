package com.sgtesting.Conoverloding;

class Politicalparty
{
	 Politicalparty(String partyname,String partysymbol)
	{
		System.out.println("Partyname:"+partyname);
		System.out.println("Partysymbol:"+partysymbol);
	}
	 Politicalparty(int seats)
	{
		System.out.println("Seats:"+seats);
	}
}
public class Codemo4 {

	public static void main(String[] args) {
		 Politicalparty o1=new  Politicalparty("BJP","Lotus");
		 Politicalparty o2=new  Politicalparty(256);
	}

}