import java.util.*;
public class Lope {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int num1 = stin.nextInt();
		Integer [] arr1 = new Integer[num1];
		for(int i=0; i<num1; i++)
		{
			arr1[i] = stin.nextInt();
		}
		Arrays.sort(arr1, Collections.reverseOrder());
		int max =0;
		for(int j =0; j<arr1.length; j++)
		{
			//System.out.println(arr1[j]);
			int k= arr1[j]*(j+1);
			if(max<k)
				max =k;
		}
		System.out.println(max);
		
		

	}

}
