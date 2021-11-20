package practice_java;

public class Honda extends Bike {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.model("active", "honda");
		h.price("activa", "honda ", 85000.00);
		h.gears=6;
		h.mileage=134;
		h.price("activa five G", "honda ", 90000.00);
		h.specification();

	}

}
