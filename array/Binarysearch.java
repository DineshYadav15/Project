package array;

//import java.util.Scanner;

public class Binarysearch {
       public static void main(String args)
       {
    	 
    	   int arr[]= {2,4,6,8,9,12,13,18,37};
    	   int srch=9;
    	   int li=0;
    	   int hi=arr.length-1;
    	   int mi=(li+hi)/2;
    	   while(li<=hi)
    	   {
    		   if(arr[mi]==srch)
    		   {
    			   System.out.println("index position is = " + mi);
    		   }
    		   else if(arr[mi]<srch)
    		   {
    			   li=mi+1;
    		   }
    		   else
    		   {
    			   mi=li-1;
    		   }
    		   mi=(li+hi)/2;
    	   }
    	   if(li>hi)
    	   {
    		   System.out.println("number is not found");
    	   }
    	   
       }

}
