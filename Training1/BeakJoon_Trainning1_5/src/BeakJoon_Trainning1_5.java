import java.util.Scanner;
public class BeakJoon_Trainning1_5 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int num = stin.nextInt();
		int b= num*2-1;
		int cnt = -1;
		String [] arr= new String[b];
		
		for(int a =0; a<arr.length; a++)
		{
			arr[a] = "*"; //�迭�� ����� �ֱ�
		}
		
		
		for(int i =0; i<b; i++)
		{
			if(i>num-1)
			{
				arr[cnt+1]="*"; // �迭cnt���� ���ֱ�
				arr[b-cnt-2]="*"; // �迭b-cnt-1���� ���ֱ�
			}
			else if(i>0 && i<num)
			{
				arr[cnt] = " ";
				arr[b-cnt-1]= " ";
			}
			
			for(int j =0; j<arr.length; j++)
			{
				if(j>num)
					if(arr[j]==" ")
					break;
				System.out.print(arr[j]);//�迭 ���
			}
			System.out.println("");
			cnt++;//cnt����
		}

	}

}
