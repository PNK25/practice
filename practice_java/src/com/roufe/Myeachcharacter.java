package com.roufe;

public class Myeachcharacter {
	
	public void eachcharacter(String str) {
		str.replace(" ","");
		
		char g[]=str.toCharArray();
		int i=0;
		
		while(i<g.length) {
			int len=str.length();
		String s=str.replace(""+str.charAt(i),"");
		int h=s.length();
		int total=len-h;
		
	
			System.out.println(str.charAt(i)+"  "+total);
			str.replace(""+str.charAt(i),"");
			str.substring(i);
			i++;
		}
		
		}
	
	
	public static void main(String[] args) {
		Myeachcharacter ch=new Myeachcharacter();
          String str="naveen";
          ch.eachcharacter(str);
	}

}
