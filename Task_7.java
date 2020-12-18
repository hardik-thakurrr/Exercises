//Find Fibonacci of N numbers
package javaExercises;
import java.util.*;
public class TASK_7 {
		
			public static void main(String[] args) {
				Scanner sac=new Scanner(System.in);
				int i=1,a=0,b=1,c=0,n;
				System.out.printf("Enter the Value of N -> ");
				n = sac.nextInt();
				sac.close();
				System.out.printf("Fibonacci Series Till Number %d is: ",n).println();
				for(i=1;i<=n;i++)
				{
					System.out.printf("%d\t",a);
					c=a+b;
					a=b;
					b=c;
				}
				
				System.out.print("\n");
	}

}
