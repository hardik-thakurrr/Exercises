package javaExercises;

import java.util.*;

public class TASK_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf(" Enter the Time in Minutes -> ");
		int minutes= sc.nextInt();
		if(minutes==0)
		{
			System.out.println(" Invalid Input !");
		}
		else
		{
			calculate(minutes);
		}
		sc.close();
	}
	
	public static void calculate(int min) {
		double days;
		int years,finalDays;
		years=(int)(min/525949.2);
		System.out.println(" Number of Years is -> "+years);
		days=(min%525949.2);
		finalDays=(int)(days/1440);
		System.out.println(" Number of Days is -> "+finalDays);
	}
	
}
