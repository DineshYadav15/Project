package array;

import java.util.Scanner;

public class SumOddOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the limit:");
		int num=s1.nextInt();
   
   
   int sum=0;
   for(int i=0;i<num;i++)
   {
	   if(num%2==1)
	   {
		   sum=sum+i;
	   }
	   System.out.print("\t"+sum);
   }
	  
   }
	}


