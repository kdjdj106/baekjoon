import java.util.Scanner;
public class BeakJoon_function {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		if(a<100)
			System.out.println(a);
		else {
			int cnt = aaa(a);
			System.out.println(cnt+99);
		}

	}
	
	public static int aaa(int num) {
		
		int [] arr = new int[4];
		int cnt =0;
		
		for(int i=100; i<=num; i++)	
		{	
			int a= i;
			System.out.println(num);
			for(int j=0; j<arr.length; j++)
			{
				arr[j] = a%10;
				a /= 10;
				
			}
			if(i==1000)
				break;
			if(arr[0] - arr[1] == arr[1]- arr[2])
				cnt++;
		
		}
		System.out.println(cnt);
		return cnt;
		
	}

}
