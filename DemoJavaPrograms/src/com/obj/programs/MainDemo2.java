package com.obj.programs;
class TwoWheeler
{
	String twname;
	int twstroke;
	String fueltype;
	int cc;
}

class FourWheeler
{
	String fwname;
	String geartype ;
	String fueltype;
	String color;
}
class HeavyVehicle
{
	String hvname;
	String enginetype;
	String fueltype;
	String color;

}

	
	
public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheeler obj1=new TwoWheeler();
		obj1.twname="Pulsar";
		obj1.twstroke=4;
		obj1.fueltype="petrol";
		obj1.cc=220;
		System.out.println("Twname:"+obj1.twname);
		System.out.println("Twstroke:"+obj1.twstroke);
		System.out.println("Fueltype:"+obj1.fueltype);
		System.out.println("CC:"+obj1.cc);
		System.out.println("+++++++++++++++++++");
		FourWheeler obj2=new FourWheeler();
		obj2.fwname="car";
		obj2.geartype="Auto";
		obj2.fueltype="Diesel";
		obj2.color="red";
		System.out.println("Fwname:"+obj2.fwname);
		System.out.println("Gtype:"+obj2.geartype);
		System.out.println("Ftype:"+obj2.fueltype);
		System.out.println("Colour:"+obj2.color);
		System.out.println("+++++++++++++++++++");
		HeavyVehicle obj3=new HeavyVehicle();
		obj3.hvname="Bus";
		obj3.enginetype="BSIV";
		obj3.fueltype="diesel";
		obj3.color="Red";
		System.out.println("HVname:"+obj3.hvname);
		System.out.println("EngineType:"+obj3.enginetype);
		System.out.println("Fueltype:"+obj3.fueltype);
		System.out.println("Color:"+obj3.color);
	}
}

