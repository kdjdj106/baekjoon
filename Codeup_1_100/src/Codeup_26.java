import java.util.*;

public class Codeup_26 {

	public static void main(String[] args) {
		Scanner stin  = new Scanner(System.in);
		String str2 ="00";
		String str1 = stin.nextLine();
		StringTokenizer st =  new StringTokenizer(str1, ":");
		String[] nums = new String[3];
		int i=0; 
		while(st.hasMoreTokens()) {
			nums[i] = st.nextToken();
			i+=1;
		}
		if(nums[1].equals(str2))
			nums[1] ="0";
		System.out.println(nums[1]);

	}

}
