package study;


class VehicleException extends RuntimeException {
	String reason;
	int cc;
	
	public VehicleException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleException(String reason, int cc) {
		super();
		this.reason = reason;
		this.cc = cc;
		
		
	}
	@Override
	public String toString() {
		return "VehicleException [reason=" + reason + ", cc=" + cc + "]";
	}
	
	
	
}
class UnsafetyException   extends RuntimeException {
	String reason;
	int safety;
	public UnsafetyException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnsafetyException(String reason, int safety) {
		super();
		this.reason = reason;
		this.safety = safety;
	}
	@Override
	public String toString() {
		return "UnsafetyException [reason=" + reason + ", safety=" + safety + "]";
	}
	
}
class Car {
	String name;
	int cc;
	int safety;
	int price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, int cc, int safety, int price) {
		super();
		this.name = name;
		this.cc = cc;
		this.safety = safety;
		this.price = price;
	}

	void check()throws VehicleException, UnsafetyException {
		if(cc <1000) {
			VehicleException c = new VehicleException("It is a Two Wheeler, not Four Wheeler", cc);
			throw c;
		}else if(cc>4000){
			VehicleException c = new VehicleException("It is a Vehicle not a Train", cc);
			throw c;	
		}else if(safety!=5){
			UnsafetyException ag = new UnsafetyException("Sorry, Invalid Safty features", safety);
			throw ag;	
		}
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", cc=" + cc + ", safety=" + safety + ", price=" + price + "]";
	}
	
}
public class FourWheeler {
	public static void main(String[] args) {
		try {
			Car candidate1 = new Car("Baleno", 100,5,800000);
			System.out.println(candidate1);
			candidate1.check();
			System.out.println("Not Fourwheeler\n");
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		System.out.println();
		
		try {
			Car candidate2 = new Car("Bolero",8000,5,850000);
			System.out.println(candidate2);
			candidate2.check();
			System.out.println("Not Fourwheeler\n");
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		System.out.println();
		
		try {
			Car candidate3 = new Car("Santro",2000, 3,900000);
			System.out.println(candidate3);
			candidate3.check();
			System.out.println("Perfect Fourwheeler\n");
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
		System.out.println();
		
		try {
			Car candidate4 = new Car("Swift",3000,5,985000);
			System.out.println(candidate4);
			candidate4.check();
			System.out.println("Perfect Fourwheeler\n");
		}catch(VehicleException ae){
			System.out.println(ae);
		}catch(UnsafetyException ae){
			System.out.println(ae);
		}
	}
}
