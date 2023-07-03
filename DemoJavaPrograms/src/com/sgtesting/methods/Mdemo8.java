package com.sgtesting.methods;
class Str2
{
	void first(String ch[][])
	{
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				
					System.out.print(ch[i][j]+" ");
				
			}
			System.out.println();
		}

	}
}
public class Mdemo8 {

	public static void main(String[] args) {
		String ch[][]= {{"sam","path","majeti"},{"suf","pfgiu","myufi"},{"sm","pah","mai"}};
		Str2 o1=new Str2();
		o1.first(ch);


	}

}
