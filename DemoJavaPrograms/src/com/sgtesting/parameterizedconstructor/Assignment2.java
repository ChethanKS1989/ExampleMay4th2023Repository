package com.sgtesting.parameterizedconstructor;

	class TwoWheeler
	{
		String twname;
		int twstroke;
		String fueltype;
		int cc;
		TwoWheeler(String Twname,int Twstroke,String Ftype,int CC)
		{
			twname=Twname;
			twstroke=Twstroke;
			fueltype=Ftype;
			cc=CC;
			System.out.println("Twname:"+twname);
			System.out.println("Twstroke:"+twstroke);
			System.out.println("Fueltype:"+fueltype);
			System.out.println("CC:"+cc);
			System.out.println("+++++++++++++++++++");
		}
	}

	class FourWheeler
	{
		String fwname;
		String geartype ;
		String fueltype;
		String color;
		FourWheeler(String Fwname,String Gtype,String Ftype,String Colour)
		{
			fwname=Fwname;
			geartype=Gtype;
			fueltype=Ftype;
			color=Colour;
			System.out.println("Fwname:"+fwname);
			System.out.println("Gtype:"+geartype);
			System.out.println("Ftype:"+fueltype);
			System.out.println("Colour:"+color);
			System.out.println("+++++++++++++++++++");

		}
	}
	class HeavyVehicle
	{
		String hvname;
		String enginetype;
		String fueltype;
		String color;
		HeavyVehicle(String Hvname, String Enginetype, String Fueltype,String Colour)
		{
			hvname=Hvname;
			enginetype=Enginetype;
			fueltype=Fueltype;
			color=Colour;
			System.out.println("HVname:"+hvname);
			System.out.println("EngineType:"+enginetype);
			System.out.println("Fueltype:"+fueltype);
			System.out.println("Color:"+color);

		}

	}



	public class Assignment2 {

		public static void main(String[] args) {
			TwoWheeler obj1=new TwoWheeler("Pulsar",4,"petrol",220);
			TwoWheeler obj2=new TwoWheeler("Scooty",4,"petrol",220);
			FourWheeler obj3=new FourWheeler("car","Auto","Diesel","red");
			HeavyVehicle obj4=new HeavyVehicle("bus","BSVI","Diesel","Green");
		}
	}





