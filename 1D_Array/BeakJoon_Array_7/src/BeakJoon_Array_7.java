import java.util.Scanner;
public class BeakJoon_Array_7 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int a = stin.nextInt();
		
		
		for(int i =0; i<a; i++)
		{
			int sum=0;
			int b= stin.nextInt();
			//System.out.println(b);
			int [] arr = new int[b];
			for(int j=0; j<arr.length; j++)
			{
				arr[j] = stin.nextInt();
				sum += arr[j];
				//System.out.print(arr[j]+" ");
			}
			//System.out.println("첫 번째 포문 완료");
			double avg = sum/b;
			//System.out.println("평균 값 :"+avg);
			int cnt =0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]>avg)
					cnt++;
			}
//			System.out.println("카운트 값 : "+cnt);
//			System.out.println("두 번째 포문 완료 ");
//			System.out.println("b의 값 : " +b);
			double percentage = (double)cnt /(double)b *100.0;
			//System.out.println(percentage);
			System.out.println(String.format("%.3f", percentage)+"%");
			//System.out.println(percentage);
			
			
		}
		

	}

}
