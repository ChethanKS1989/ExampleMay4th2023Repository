package com.sgtesting.methods;

class Str1
{
	void last(String ch[][])
	{
		for(int i=2;i<3;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				
					System.out.print(ch[i][j]+" ");
				
			}
			System.out.println();
		}

	}
}
public class Mdemo7 {

	public static void main(String[] args) {
		String ch[][]= {{"sam","path","majeti"},{"suf","pfgiu","myufi"},{"sm","pah","mai"}};
		Str1 o1=new Str1();
		o1.last(ch);


	}

}
