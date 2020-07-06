import java.util.Scanner;
public class BeakJoon_Array_5 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		double [] arr1 = new double[n];
		double max = arr1[0];
		double sum =0;
		for(int i =0; i<arr1.length; i++ )
		{
			arr1[i] = (double)stin.nextInt();
			if(max<arr1[i])
				max= arr1[i];
		}
		for(int i =0; i<arr1.length; i++ )
		{
			arr1[i] = arr1[i]/max*100;
			sum += arr1[i];
		}
		System.out.print(sum/arr1.length);
		

	}

}
