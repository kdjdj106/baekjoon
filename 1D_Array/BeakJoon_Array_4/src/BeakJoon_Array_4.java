import java.util.Arrays;
import java.util.Scanner;
public class BeakJoon_Array_4 {

   public static void main(String[] args) {
      Scanner stin = new Scanner(System.in);
      
      int [] arr1 = new int[10];
      int a=0;
      int cnt=0;
      for(int i=0; i<10; i++)
      {
         a = stin.nextInt();
         arr1[i]= a%42;
      }
      
      Arrays.sort(arr1);
      for(int i =0; i<9; i++)
      {  
    	  if(arr1[i] == arr1[i+1])
    		  {
    		  	cnt++;
    		  }
      }
      System.out.print(arr1.length-cnt);
//      for(int i =1; i<=42; i++)
//      {
//         cnt=0;
//         for(int j=0; j<arr1.length; j++)
//         {
//            if(arr1[j]==i)
//            {
//               cnt++;
//            }
//               
//         }
//      }
      

   }

}