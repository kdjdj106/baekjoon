import java.util.Scanner;
import java.util.StringTokenizer;
public class Codeup_23 {

	public static void main(String[] args) {
		Scanner stin  = new Scanner(System.in);
        String input = stin.nextLine();
        StringTokenizer st = new StringTokenizer(input, ".");
        String[] nums = new String[2];
		int i=0; 
        while(st.hasMoreTokens())
        {
        	nums[i] = st.nextToken();
        	System.out.println(nums[i]);
        	i++;
        }
	}

}
