package Small_programsIN_java;

public class SwitchstatementForMonths {
	
	void switchEx(String month) {
		
		switch(month) {
		case"Jan":
		  System.out.println("January");
		  break;
		case"Feb":
			System.out.println("February");
			break;
		case"Mar":
			System.out.println("March");
			break;
		case"Apr":
			System.out.println("April");
			break;
		case"May":
			System.out.println("May");
			break;
		case"Jun":
			System.out.println("June");
			break;
		case"Jul":
			System.out.println("July");
			break;
		case"Aug":
			System.out.println("Auguest");
			break;
			
		case"Sep":
			System.out.println("september");
			break;
		case"Oct":
			System.out.println("October");
			break;
		case"Nov":
			System.out.println("November");
			break;
		case"Dec":
			System.out.println("December");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		SwitchstatementForMonths sw=new SwitchstatementForMonths();
		
		sw.switchEx("Jan");
	
	}

}
