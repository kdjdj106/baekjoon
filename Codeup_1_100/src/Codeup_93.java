import java.util.Scanner;
public class Codeup_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a1 = stin.nextInt();
		int [] arr1 = new int [23];
		for(int i =0; i<arr1.length; i++)
		{
			arr1[i] = 0;
		}
		for(int i =0; i<a1; i++)
		{
			int a2 = stin.nextInt();
			arr1[a2-1] +=1;
		}
		for(int i =0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}

}
