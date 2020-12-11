package javaExercises;

import java.util.Scanner;

public class TASK_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n CHOOSE ONE");
		System.out.println(" 1) Hi");
		System.out.println(" 2) Hello");
		System.out.println(" 3) Hey");
		System.out.printf(" Enter Your Choice -> ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("\n You have said 'Hi!'");
				break;
			case 2:
				System.out.println("\n You have said 'Hello!'");
				break;
			case 3:
				System.out.println("\n You have said 'Hey!'");
			default:
				System.out.println("\n INVALID CHOICE!");
				break;															
		}
		sc.close();
	}
}
