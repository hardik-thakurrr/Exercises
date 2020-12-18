package javaExercises;

import java.util.Scanner;

public class TASK_6 {

	public static void main(String[] args) {
		int i,count=0;
		Scanner sca = new Scanner(System.in);
		System.out.print(" Enter The Number -> ");
		int n=sca.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.printf("\n The Number %d is a Prime Number !! ",n);
		}
		else
		{
			System.out.printf("\n The Number %d is not a Prime Number !! ",n);
		}
	}
	
}
