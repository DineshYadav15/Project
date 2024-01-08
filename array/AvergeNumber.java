package array;
import java.util.*;
public class AvergeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the limit:");
		int n=s1.nextInt();
		int num[]=new int[n];
		System.out.println("enter the number:");
		for(int i=0;i<n;i++)
		{
			num[i]=s1.nextInt();
		}
		float sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+num[i];
		}
		float avg=sum/n;
		System.out.println("average of number = "+avg);
		
    /* int arr[]= {1,4,6};
     
     
     float sum=0;
     System.out.println("it is orignal value:");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
     
     for(int j=0;j<arr.length;j++)
     {
    	 
    	  sum=sum+arr[j];
     }
    	 float avg=sum / arr.length;
    	 System.out.print("average "+avg);*/
     }
	}


