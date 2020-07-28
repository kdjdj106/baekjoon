import java.util.*;
public class Losted_Bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		String [] arr1 = stin.nextLine().split("\\-");
		int sum =0;
		for(int i =0; i<arr1.length; i++)
		{
			int ectsum = ect(arr1[i]);
			if(i == 0)
				ectsum = ectsum* -1;
			sum -=ectsum;
			System.out.println(sum);
		}
		System.out.println(sum);

	}
	public static int ect (String str)
	{
		int ectsum =0;
		String [] arr2 = str.split("\\+");
		for(int j=0; j<arr2.length; j++)
		{	
			ectsum += Integer.parseInt(arr2[j]);
		}
		return ectsum;
	}

}
