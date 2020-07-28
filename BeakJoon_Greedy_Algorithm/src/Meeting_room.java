import java.util.*;
import java.util.Comparator;
public class Meeting_room {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		int num1 = stin.nextInt();
		int[][] arr1 = new int[num1][2];
		for(int i = 0; i<num1; i++)
		{
			arr1[i][0] = stin.nextInt();
			arr1[i][1] = stin.nextInt();
		}
		Arrays.sort(arr1, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] start, int[] end)
			{
				if(start[1]==end[1])
				{
					return Integer.compare(start[0], end[0]);
				}
			
			return Integer.compare(start[1], end[1]);
			}
		
		});
		int cnt =0;
		int end =-1;
		for(int i =0; i<num1; i++)
		{
			if(arr1[i][0]>= end)
			{
				//System.out.println(arr1[i][1]);
				end = arr1[i][1];
				System.out.println(end);
				cnt++;
			}
		}
		System.out.println(cnt);
//		for(int i = 0; i<num1; i++) 
//		{
//			for(int j =0; j<2; j++)
//				System.out.print(arr1[i][j]);
//			System.out.println();
//		}
		
	}

}
