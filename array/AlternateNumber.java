package array;
import java.util.*;
public class AlternateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the limit number of elements : ");
        int n = s1.nextInt();

       
        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
        	num[i]=s1.nextInt();
        }
        System.out.println("alternate number");
        for(int i=0;i<n;i+=2)
        {
        	System.out.println(num[i]+"");
        }
	}

}
