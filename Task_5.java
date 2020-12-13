package javaExercises;

import java.util.*;

public class Employee {
	private String name;
	private int salary;
	private int yearOfJoining;
	private String add;
	
	public void setdata()
	{
		Scanner sce = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		System.out.print("\n Enter Name -> ");
		name=sca.nextLine();
		System.out.print(" Enter Salary -> ");
		salary=sce.nextInt();
		System.out.print(" Enter Year of Joining -> ");
		yearOfJoining=sce.nextInt();
		System.out.print(" Enter Address -> ");
		add=sca.next();
	}
	
	public void putdata()
	{
		System.out.print("\n");
		System.out.println(" "+name+"\t "+salary+"\t   "+yearOfJoining+"\t\t "+add);
	}
	
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter The number of Employees -> ");
		n=sc.nextInt();
		Employee obj[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			System.out.printf(" Enter the Details of Employee %d:",i+1);
			obj[i]=new Employee();
			obj[i].setdata();
		}
		System.out.println("\n Printing Details of the Employees ");
		System.out.print("\n Name\t Salary\tYearofJoining\t Address ");
		for(i=0;i<n;i++)
		{
			obj[i].putdata();
		}
		
	
	}
}
