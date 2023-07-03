package com.sgtesting.in;

interface PoliticalParty
{
	void ShowPoliticalPartyName(String Name);
	void ShowPoliticalPartyIdnum(int Idnum);
	void ShowPoliticalPartyLeader(String Name);
}
interface ChiefMinister 
{
	void ShowChiefMinisterName(String Name);

	void ShowChiefMinisterIdnum(int Num);
}
class MLA implements ChiefMinister,PoliticalParty
{

	public void ShowPoliticalPartyName(String Name)
	{
		System.out.println("Political Party Name:"+Name);
	}
	public void ShowPoliticalPartyIdnum(int Idnum)
	{
		System.out.println("Political PartyIdnum:"+Idnum);
	}
	public void ShowPoliticalPartyLeader(String Name)
	{
		System.out.println("Political Leader Name:"+Name);
	}
	public void ShowChiefMinisterName(String Name)
	{
		System.out.println("ChiefMinisterName:"+Name);
	}
	public void ShowChiefMinisterIdnum(int Num)
	{
		System.out.println("ChiefMinister Idnum:"+Num);
	}
}

public class A1 {
	public static void main(String[] args) {
		MLA j=new MLA();
		j.ShowPoliticalPartyName("Bharatiya Janatha Party");
		j.ShowPoliticalPartyIdnum(1278908);
		j.ShowPoliticalPartyLeader("Narendra Modiji");
		j.ShowChiefMinisterName("BS Yadiyurappa");
		j.ShowChiefMinisterIdnum(3456784);

	}
}
