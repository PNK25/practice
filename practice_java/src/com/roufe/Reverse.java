package com.roufe;

public class Reverse {

	
	
	public static void main(String[] args) {
		String str="naveen kumar";
		String e=str.replace(" ","");
		String d="";
		for( int i=e.length()-1;i>=0;i--) {
			d=d+e.charAt(i);
			
		}
		System.out.println(d);
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		StringBuilder sf=new StringBuilder(str);
		System.out.println(sf.reverse());
		
	}

}
