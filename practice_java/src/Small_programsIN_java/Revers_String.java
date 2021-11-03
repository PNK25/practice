package Small_programsIN_java;

public class Revers_String {

	public static void main(String[] args) {
		String t="naveen kumar";
		char a[]=t.toCharArray();
	    int len=a.length;
		String revers="";
		String rev="";
		for(int i=t.length()-1;i>=0;i--) {
			
			revers=revers+t.charAt(i);
		}
		for(int j=len-1;j>=0;j--) {
			rev=rev+a[j];
		}
		System.out.println("reversing a string :"+revers);
			System.out.println("reversing a string:"+rev);
			
		StringBuffer mj=new StringBuffer(t);
		System.out.println("by using stringBuffer reversing a string: "+mj.reverse());
		
		
		StringBuilder h=new StringBuilder(t);
		System.out.println("by using stringBuilder reversing a string:  "+h.reverse());
		
		
			
		

	}

}
