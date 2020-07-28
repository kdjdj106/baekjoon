import java.util.*;
public class Change {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int [] arr1 = new int[6];
		arr1[0] =500;
		arr1[1] =100;
		arr1[2] =50;
		arr1[3] =10;
		arr1[4] =5;
		arr1[5] =1;
		int sum =0;
		int num1 = 1000-stin.nextInt();
		for(int i =0; i<arr1.length; i++)
		{
			if(num1>=arr1[i])
			{
				sum += num1/arr1[i];
				//System.out.println(num1);
				num1 = num1 % arr1[i];
			}
		}
		System.out.println(sum);

	}

}
