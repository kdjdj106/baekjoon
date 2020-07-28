import java.util.Scanner;

public class Coin_0 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int num1 = stin.nextInt();
		int num2 = stin.nextInt();
		int cnt=0;
		
		int [] arr1 = new int[num1];
		for(int i =0; i<arr1.length; i++)
			arr1[i]= stin.nextInt();
		for(int i =arr1.length-1; i>=0; i--)
		{
			if(num2>=arr1[i])
			{
				cnt += num2/arr1[i];
				num2 = num2%arr1[i];
			}
		}
		System.out.println(cnt);

	}

}
