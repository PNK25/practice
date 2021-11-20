package practice_java;

public class String_in_java {

	public static void main(String[] args) {
		 String s1="class in objectd";
		 String s2="variables in java";
		 System.out.println(s1.charAt(2));
		 System.out.println(s1.codePointAt(1));
		 System.out.println(s1.codePointBefore(1));
		 System.out.println(s1.codePointCount(1,2));
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.compareToIgnoreCase(s2));
		 System.out.println(s1.concat(" "+s2));
		 System.out.println(s1.contains(s2));
		 System.out.println(s1.contentEquals(s2));
		 
	}

}
