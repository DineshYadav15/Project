package array;
import java .util.*;
public class Bubbleshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {34,45,12,67,23,78};
		Scanner s1=new Scanner(System.in);
		System.out.println("enter limit element");
		int num=s1.nextInt();
		int number[]=new int[num];
		System.out.println("enter the elemnnt");
		int temp;
		for(int i=0;i<num;i++)
		{
			
			number[i]=s1.nextInt();
			
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-1;j++)
			{
				if(number[j]>number[j+1])
				{
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		System.out.println("short the array ");
		for(int i=0;i<num;i++)
		{

			System.out.print("\t" +number[i]);
			
		}
	}

}
