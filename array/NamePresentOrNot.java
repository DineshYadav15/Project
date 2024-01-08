package array;
import java.util.*;
public class NamePresentOrNot {

	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the limit");
		int arr=s1.nextInt();
		s1.nextLine();
		 String arrname[]=new String[arr];

		for(int i=0;i<arr;i++)	
		{
			//System.out.println("enter the name");
			 System.out.print("Enter name " + (i + 1) + ": ");
			arrname[i]=s1.nextLine();
		}
	//String arr[]= {"Ravi","Dinesh","Rohan","Gauri","Baijanti","Pradeep","Sai"};
		 //String item="dinesh";
		System.out.print("Enter a name to search for: ");
        String item = s1.nextLine();
        
	        
	int temp=0;
	for(int i=0;i<arr;i++)
	{
		if(arrname[i].equals(item))
			
		{
			System.out.println("it is present name");
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("it is not present name");
	}

	}

}
