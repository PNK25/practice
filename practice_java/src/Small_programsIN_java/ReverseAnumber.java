package Small_programsIN_java;

public class ReverseAnumber {

	public static void main(String[] args) {
		int r=356567;
		int reverse = 0;
		while(r!=0){
	
		 reverse=(int) (reverse*10+r%10);
		 r=r/10;
		}
		System.out.println(reverse);
		
		// buy using stringBuffer we can reverse the number
		StringBuffer o=new StringBuffer();
		o.append(r);
	    System.out.println(o.reverse());
		
		// using bulitBuffer we can reverse string
		StringBuffer obje=new StringBuffer();
		obje.append(r);
		System.out.println(obje.reverse());
}
}