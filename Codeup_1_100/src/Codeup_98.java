import java.util.Scanner;
import java.io.*;
public class Codeup_98 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int height = stin.nextInt();
		int width = stin.nextInt();
		int[][] arr = new int[height][width];
		int count = stin.nextInt();
		
		for(int i = 1; i<=count; i++)
		{
			int length = stin.nextInt();
			int direction = stin.nextInt();
			int x = stin.nextInt();
			int y = stin.nextInt();
			if(direction ==0)
			{
				for(int j =y; j<y+length; j++)
				{
					arr[x-1][j-1]=1;
				}
				
			}
			else
			{
				for(int j =x; j<x+length; j++)
				{
					arr[j-1][y-1]=1;
				}
			}
			}
		for(int i =0; i<height; i++)
		{
			for(int j =0; j<width; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}
		}
		
	}


