import java.util.*;
public class Thirty {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		String str1 = stin.nextLine();
		
		String [] arr1 = str1.split("");
		Integer [] arr2 = new Integer [arr1.length];
		for(int i =0; i<arr1.length; i++)
		{
			arr2[i] = Integer.valueOf(arr1[i]);
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		int num1= arr2[arr2.length-1];
		
		if(num1 != 0)
			System.out.println(-1);
		else
		{
			int sum =0;
			for(int i =0; i<arr2.length; i++)
			{
				sum += arr2[i];
			}
			if(sum % 3 == 0) 
			{
				for(int i =0; i<arr2.length; i++)
					System.out.print(arr2[i]);
			}
			else
				System.out.println(-1);
		}

	}

}
