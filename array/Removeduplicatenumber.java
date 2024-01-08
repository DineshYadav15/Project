package array;
import java.util.*;
//import java.util.HashSet;
//* ke ander aajata hain.
public class Removeduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s1=new Scanner(System.in);
    System.out.print("enter the limit number :");
    int num=s1.nextInt();
    System.out.println(" ");
    int number[]=new int[num];
    System.out.print("enter the number:");
    for(int i=0;i<num;i++)
    {
    	number[i]=s1.nextInt();
    }
   
    System.out.print("duplicate number : ");
    HashSet<Integer> s2= new HashSet<>();
    for(int i=0;i<num;i++)
    {
    	s2.add(number[i]);
    	
    }
    for(int no:s2)
    {
    	System.out.println(no);
    }
	}

}
