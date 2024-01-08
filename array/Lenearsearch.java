package array;
import java.util.*;
public class Lenearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s1=new Scanner(System.in);
		 int arr[]= {1,3,4,2,5,6,6,7,8};
		System.out.println("enter the elemnt");
		int num=s1.nextInt();
		int count=0;
		
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]==num)
    	 {
    		 System.out.println("search the element index position = " +i);
    		 count=count+1;
    	 }
     }
     if(count==0)
     {
    	 System.out.println("it is not found the number");
     }
	}

}
