package com.obj.programs;
class S 
{
	S(int x, int y)
	{
		System.out.println("add:"+(x+y));
	}
}
class R extends S{
	R (int x, int y)
	{
		super(x,y);
		//System.out.println("add:"+(x+y+z));
	}
}
class j extends R {
	j (int x, int y)
	{
		super(x,y);
	}
	}

public class A1  {
 public static void main(String[] args) {
 	j o = new j(10,20);
 	
 	
 	
    
 }
}


