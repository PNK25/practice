package practice_java;

public class Bike {
	
	int wheels=2,gears=5,mileage=125 ;
	double price;
	String bikename,brandname,arr[];
	
	void model(String bikename,String brandname) {
		System.out.println(bikename+"  "+brandname);
	}
	void price(String bikename,String brandname,double price) {
		System.out.println(bikename+" "+brandname+""+price);
	}
	 void specification() {
		 System.out.println("wheels:"+wheels+" "+"gears:"+gears+" "+"mileage:"+mileage);
		 
	 }
	 
	 
	public Bike() {
         System.out.println();

	}

}
