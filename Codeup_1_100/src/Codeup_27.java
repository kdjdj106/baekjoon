import java.util.*;
public class Codeup_27 {

	public static void main(String[] args) {
		Scanner stin  = new Scanner(System.in);
		String str1 = stin.nextLine();
		
		StringTokenizer st = new StringTokenizer(str1, ".");
		String [] arr1 = new String[3];
		int i=0; 
		String[] nums = new String[3];
		while(st.hasMoreTokens()) {
			nums[i] = st.nextToken();
			
			
			i+=1;
		}
		for(int j=nums.length-1; j>=0; j--) 
		{
			System.out.print(nums[j]);
			if(j==0)
				break;
			System.out.print("-");
		}

	}

}
