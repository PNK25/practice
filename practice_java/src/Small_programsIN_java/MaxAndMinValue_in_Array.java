package Small_programsIN_java;

public class MaxAndMinValue_in_Array {

	public static void main(String[] args) {
	    int arr[]= {32,45,25,77,27};
	    int max=arr[0];
	    int min=arr[0];
	    for(int i=1;i<arr.length;i++) 
	    {	    	
	    	if(arr[i]>max) 
	    	{	
	    	     max=arr[i];   
	          }
	    	if(arr[i]<min) {
   	    	 min=arr[i];
   	     }	
	    	}
	    
	      System.out.println("maxs value of array :" + max);
	      System.out.println("min value of array :" + min);
	      
	    }
	
	}


