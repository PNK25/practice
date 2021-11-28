package com.roufe;

public class Myeachcharacter {
	
	public void eachcharacter(String str) {
		
		
		
	
		
		while(str.length()>0) {
			 
		char ch=str.charAt(0);
		String h=str.replace(""+ch,"");
		
		int total=str.length()-h.length();
		
		System.out.println(ch+"  "+total);
		str=str.replace(""+ch,"");
		
		}
		
		}
	
	
	public static void main(String[] args) {
		Myeachcharacter ch=new Myeachcharacter();
          String str="naveen naveen";
         str= str.replace(" ","");
          ch.eachcharacter(str);
	}

}
