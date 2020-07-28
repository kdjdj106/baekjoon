import java.util.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int num1 = stin.nextInt();
		int [] arr1 = new int[num1];
		for(int i =0; i<num1; i++)
		{
			arr1[i] = stin.nextInt();
		}
		Arrays.sort(arr1);
		int sum =0;
		int cnt=0;
		for(int i =0; i<arr1.length; i++)
		{
			for(int j =0; j<=i; j++)
				sum += arr1[j];
		}
		System.out.println(sum);

	}

}
