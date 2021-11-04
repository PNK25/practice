package Small_programsIN_java;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	System.out.print("Enter a number:");
     int num=k.nextInt();
     int fact=1;
     
     for(int i=1;i<=num;i++) {
    	 
    	 fact=fact*i;
     }
   
     System.out.println("factorial of a "+num+" is "+fact);
	}

}
