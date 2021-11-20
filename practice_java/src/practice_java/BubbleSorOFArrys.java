package practice_java;

import java.util.Arrays;

public class BubbleSorOFArrys {
	
 public static void main (String[]args)
		    {
		    
    int arr[]= {2,5,7,1,8};
    System.out.println("arry befor serched values"+ Arrays.toString(arr));
    int l=arr.length;// 0-5
  System.out.println(l);
    for(int i=0;i<l-1;i++) {
    	
    	for(int j=0;j<l-1;j++) {
    		
    	if(arr[j]>arr[j+1]) {
    		int temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;
    		
    	}
    
    	}	
    
    }
    System.out.println("arry aefor serched values"+ Arrays.toString(arr));
	}

}
