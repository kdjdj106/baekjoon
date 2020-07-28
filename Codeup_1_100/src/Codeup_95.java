import java.util.Scanner;
public class Codeup_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a1 = stin.nextInt();
		
		int [] arr1 = new int[a1];
		for(int i =0; i<arr1.length; i++)
		{
			arr1[i]= stin.nextInt();
		}
		int min =arr1[0];
		for(int i =0; i<arr1.length; i++)
		{
			if(arr1[i] <min)
				min = arr1[i];
		}
		System.out.println(min);
		
	}

}
