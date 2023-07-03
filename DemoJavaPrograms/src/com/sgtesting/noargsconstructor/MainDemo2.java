package com.sgtesting.noargsconstructor;


class TwoWheeler
{
	String twname;
	int twstroke;
	String fueltype;
	int cc;
	TwoWheeler()
	{
		twname="Pulsar";
		twstroke=4;
		fueltype="petrol";
		cc=220;
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
	FourWheeler()
	{
		fwname="car";
		geartype="Auto";
		fueltype="Diesel";
		color="red";
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
	HeavyVehicle()
	{
		hvname="Bus";
		enginetype="BSIV";
		fueltype="diesel";
		color="Red";
		System.out.println("HVname:"+hvname);
		System.out.println("EngineType:"+enginetype);
		System.out.println("Fueltype:"+fueltype);
		System.out.println("Color:"+color);

	}

}



public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheeler obj1=new TwoWheeler();
		FourWheeler obj2=new FourWheeler();
		HeavyVehicle obj3=new HeavyVehicle();
	}
}


