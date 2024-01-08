package array;
import java.util.*;
public class IntigerArrayDouble {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter limit number:");
		int n=s1.nextInt();
		int num[]=new int[n];
		System.out.println("enter the number");
		for(int i=0;i<n;i++)
		{
			num[i]=s1.nextInt();
		}
		
		System.out.println("it is double:");
		for(int i=0;i<=n;i++)
		{
			System.out.print("\t"+num[i]*2);
		}
		

	}

}
