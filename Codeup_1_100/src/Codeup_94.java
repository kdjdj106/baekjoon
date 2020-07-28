import java.util.Scanner;
public class Codeup_94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a1 = stin.nextInt();
		int [] arr1 = new int[a1];
		for(int i =0; i<arr1.length; i++)
		{
			arr1[i]= stin.nextInt();
		}
		for(int i =arr1.length-1; i>=0; i--)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}

}
