import java.util.Scanner;
public class BeakJoon_Array_2 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int [] arr1 = new int [9];
		
		for(int i =0; i<arr1.length; i++)
		{
			arr1[i] = stin.nextInt();
		}
		int max = arr1[0];
		int num =0;
		for(int i =0; i<arr1.length; i++)
		{
			if(arr1[i]>max)
			{
				max = arr1[i];
				num = i;
			}
		}
		System.out.println(max);
		System.out.print(num+1);

	}

}
