package array;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,3,4,6,5,7,8,9};
   System.out.println("it is original value:-");
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print("\t"+arr[i]);
    }
   System.out.println("reverse number:-");
	   for(int j=arr.length-1;j>=0;j--)
	   {
		   System.out.print("\t"+arr[j]);
	   }
   
	}

}
