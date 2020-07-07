
import java.util.Scanner;
public class BeakJoon_funtion_1 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int [] arr = new int[100001];
		for(int i=1; i<10001; i++)
		{
			int n =nd(i);
			if(n<=10000)
			arr[n] =0;
		}
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i] != 0)
				System.out.println(i);
		}
	}
	
	public static int nd(int a) {
		int [] arr1 = new int[4];
		int nd =a;
		int sum =0;
		for(int i=0; i<4; i++)
		{
			a =a%10;
			arr1[i] = a;
			sum +=a;
			a = a/10;
		}
		nd = nd+sum;
		return nd;
	}
	

}
