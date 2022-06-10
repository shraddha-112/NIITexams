package exams;

import java.util.*;


class VehicleException  extends RuntimeException {
	String reason; 
	int cc;
	public VehicleException () {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleException (String reason, int cc) {
		super();
		this.reason = reason;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "VehicleException  [reason=" + reason + ", cc=" + cc + "]";
	}
	
}
class UnsafetyException   extends RuntimeException {
	String reason;
	int safety;
	public UnsafetyException () {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnsafetyException (String reason, int safety) {
		super();
		this.reason = reason;
		this.safety = safety;
	}
	@Override
	public String toString() {
		return "UnsafetyException  [reason=" + reason + ", safety=" + safety + "]";
	}
}

 class FourWheeler {
	 
	 String name;
	 int cc;
	 int safety;
	 int price;
	public FourWheeler()
	{
		super();
	
	}
	public  FourWheeler(String name, int cc, int safety, int price)
	 {
			super();
		 this.name = name;
		 this.cc = cc;
		 this.safety = safety;
		 this.price = price;
	 }
	void check()throws VehicleException, UnsafetyException {
		if(cc <1000 ) {
			VehicleException ag = new VehicleException("It is a Two Wheeler, not Four Wheeler’ ", cc);
			throw ag;
		}else if( safety!=5){
			UnsafetyException ag = new UnsafetyException("Sorry, Invalid Safty features", safety);
			throw ag;	
		}
	}
	@Override
	public String toString() {
		return "FourWheeler [name=" + name + ", cc=" + cc + ", safety=" + safety + ", price=" + price + "]";
	}
}



public class Car {
	
	public static void main(String args[])
	{
		
		try {
			FourWheeler fw = new FourWheeler("MARUTI", 800, 0, 1000);
			System.out.println(fw);
			fw.check();
			
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
						
			FourWheeler fw1 = new FourWheeler("Honda", 800, 0, 1100);
			System.out.println(fw1);
			fw1.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
			
			FourWheeler fw2 = new FourWheeler("BMW", 5000, 0, 1200);
			System.out.println(fw2);
			fw2.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		try {
			
			FourWheeler fw3 = new FourWheeler("SUZUKI", 1200, 5, 1300);
			System.out.println(fw3);
			fw3.check();
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
	}

}
