import java.util.Scanner;
public class BeakJoon_Array_6 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int n = stin.nextInt();
		int cnt, sum;
		String a;
		String b= "O";
		String[] arr1 = new String[n];
		String[] arr2 = new String[80];
		
		for(int i =0; i<arr1.length; i++)
		{
			arr1[i] = stin.next();
		}
		for(int i =0; i<arr1.length; i++)//���� ���ڿ��� ���ڴ����� ���� �ٸ��迭�� ����
		{
			a = arr1[i];
			arr2 = a.split("");//���ڴ����� ���� ����
			cnt =0;
			sum =0;
			for(int j=0; j<arr2.length; j++)//O, X�� �ִ� �迭�� ����
			{
				if(arr2[j].equals(b))// O�϶� 
				{
					if(j==0)
						cnt=1;
					if(j>0)
					if(arr2[j].equals(arr2[j-1]))//���� �����ε����� O�϶�
					{
						cnt++;
					}
					//System.out.println("cnt++�� cnt �� : "+cnt);
					sum = sum +cnt;
				}
				else//X�϶�
				{
					cnt =1;
				}
				
				System.out.println("sum �� cnt�� �� :" +sum+", "+cnt);
				
//				if(arr2[j] ==null)// ��������� break
//				break;
					
			}
			System.out.println(sum);
			
		}
		
		
	}
}
