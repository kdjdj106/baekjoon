import java.util.Scanner;
public class BeakJoon_Training1_6 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int a= stin.nextInt();
		int a1 = ((a-1)/2)*2 +1;
		int a2 = (a/2)*2;
		String [] arr1 =new String[a1]; 
		String [] arr2 =new String[a2];
		for(int i =0; i<arr1.length; i++)
		{
			if(i%2 ==0)
			{
				arr1[i] = "*";
			}
			else
				arr1[i]= " ";
			
		}
		for(int i=0; i<arr2.length; i++)
		{
			if(i%2 ==1)
			arr2[i]="*";
			else
				arr2[i]= " ";
		}
		
		for(int i =0; i<a*2; i++)
		{
			if(i%2==0)
			{
				for(int j=0; j<arr1.length; j++)
				System.out.print(arr1[j]);
			}
			else
			{
				for(int k=0; k<arr2.length; k++)
				System.out.print(arr2[k]);
			}
			System.out.println("");
		}

	}

}
