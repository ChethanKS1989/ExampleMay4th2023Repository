package com.sgtesting.mreturn;

class Vowel
{
	String check(char ch) 
	{
		switch(ch)

		{
		case 'a':case'e':case'i':case'o':case'u':

			break;
		default:
			return "not a vowel";
		}
		return "it is a vowel";
	}

}

public class Rdemo1 {
	public static void main(String[] args) {
		Vowel o=new Vowel ();
		String o1=o.check('a');
		System.out.println(o1);
	}
}


