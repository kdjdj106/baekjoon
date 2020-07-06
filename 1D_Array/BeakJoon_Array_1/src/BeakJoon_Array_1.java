import java.util.Scanner;
public class BeakJoon_Array_1 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		
		int [] arr1= new int [n]; 
		for(int i=0; i<n; i++)
		{
			arr1[i]= stin.nextInt();
		}
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0; i<n; i++)
		{
			if(arr1[i]>max)
				max = arr1[i];
			if(arr1[i]<min)
				min = arr1[i];
						
		}
		System.out.print(min+" "+max);

	}

}
