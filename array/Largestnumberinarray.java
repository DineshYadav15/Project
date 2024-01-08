package array;

public class Largestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,13,56,14,35,99};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		System.out.println(arr[2]);
		
	}

}
