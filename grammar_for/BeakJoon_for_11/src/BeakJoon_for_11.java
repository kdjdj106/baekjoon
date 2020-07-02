import java.util.Scanner;

public class BeakJoon_for_11 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		int a = stin.nextInt();
		int [] arr = new int [n];
		for(int i =0; i<arr.length; i++)
		{
			int b =stin.nextInt();
			arr[i] = b;
		}
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]<a)
				System.out.print(arr[i]+" ");
		}

	}

}