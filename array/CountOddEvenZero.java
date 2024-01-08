package array;

import java.util.Scanner;

public class CountOddEvenZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the number of limit elements :");
        int n = s1.nextInt();

       
        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
        	num[i]=s1.nextInt();
        }
        int  evencount=0;
        int oddcount=0;
        int zerocount=0;
        for(int i=0;i<n;i++)
        {
        	if(num[i]==0)
        	{
        		
        		zerocount++;
        		
        	}
        	else if(num[i]%2==0)
        	{
        		
        		evencount++;
        	}else
        	{
        		oddcount++;
        		
        	}
        	
        }
        	System.out.println("zero="+zerocount);
        	System.out.println("even="+evencount);
        	System.out.println("odd="+oddcount);
	}

}
