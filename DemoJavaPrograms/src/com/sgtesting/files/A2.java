package com.sgtesting.files;

import java.io.File;

public class A2 {

	
		public static void main(String[] args) {
			weekdaynamesubfolders();

		}
		private static void weekdaynamesubfolders()
		{
			File f=new File("G:\\Demo1\\Sunday\\Monday\\Tuesday\\Wednesday\\Thursday\\Friday\\Satuday");
			boolean v2=f.mkdirs();
			System.out.println("whether nested folder has created:"+v2);
			System.out.println("--------------");
		}


	}


