package array;

public class Binarysearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7,9,12,13,14};
		int key=7;
     int start=0;
     int end=arr.length-1;
     while(start<=end)
     {
    	int mid=(start+end)/2;
    	if(arr[mid]==key)
    	{
    		System.out.println(arr[mid]);
    	}
    	else if(arr[mid]<key)
    	{
    		start=mid+1;
    		
    	}
    	else
    	{
    		end=mid-1;
    	}
     }
     if(start>end)
	   {
		   System.out.println("number is not found");
	   }
	   
	}

}
