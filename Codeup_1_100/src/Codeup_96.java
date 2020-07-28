import java.util.Scanner;
public class Codeup_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int [][] arr1 = new int [19][19];
		for(int i =0; i<19; i++)
			for(int j=0; j<19; j++)
			{
				arr1[i][j] =0;
			}
		int a1 = stin.nextInt();
		
		for(int i=0; i<a1; i++)
		{
			int num1 = stin.nextInt();
			int num2 = stin.nextInt();
			arr1[num1-1][num2-1] =1;
		}
		for(int i =0; i<19; i++)
		{
			for(int j=0; j<19; j++)
			{
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println("");
		}
		
	}

}
