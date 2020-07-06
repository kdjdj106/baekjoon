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
		for(int i =0; i<arr1.length; i++)//받은 문자열을 글자단위로 나눠 다른배열에 저장
		{
			a = arr1[i];
			arr2 = a.split("");//글자단위로 나눠 저장
			cnt =0;
			sum =0;
			for(int j=0; j<arr2.length; j++)//O, X가 있는 배열을 나열
			{
				if(arr2[j].equals(b))// O일때 
				{
					if(j==0)
						cnt=1;
					if(j>0)
					if(arr2[j].equals(arr2[j-1]))//만약 이전인덱스도 O일때
					{
						cnt++;
					}
					//System.out.println("cnt++후 cnt 값 : "+cnt);
					sum = sum +cnt;
				}
				else//X일때
				{
					cnt =1;
				}
				
				System.out.println("sum 과 cnt의 값 :" +sum+", "+cnt);
				
//				if(arr2[j] ==null)// 비어있으면 break
//				break;
					
			}
			System.out.println(sum);
			
		}
		
		
	}
}
