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
			//System.out.println("ù ��° ���� �Ϸ�");
			double avg = sum/b;
			//System.out.println("��� �� :"+avg);
			int cnt =0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]>avg)
					cnt++;
			}
//			System.out.println("ī��Ʈ �� : "+cnt);
//			System.out.println("�� ��° ���� �Ϸ� ");
//			System.out.println("b�� �� : " +b);
			double percentage = (double)cnt /(double)b *100.0;
			//System.out.println(percentage);
			System.out.println(String.format("%.3f", percentage)+"%");
			//System.out.println(percentage);
			
			
		}
		

	}

}
