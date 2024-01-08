package array;
import java.util.*;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = s1.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = s1.nextInt();
        }
        int maxNumber = findMaxNumber(numbers);

        System.out.println("The maximum number in the array is: " + maxNumber);
    }
	
        public static int findMaxNumber(int[] arr)
        {
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] > max) 
                {
                    max = arr[i]; 
                }
            }

            return max;
	}

}
