//Addition and Multiplication of Matrices
package javaExercises;

public class TASK_4 {

	public static void main(String[] args) {
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int c[][]= new int[3][3];
		int d[][]= new int[3][3];
		int i,j,k=0;
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		System.out.println(" After Addition of the Matrices..");
		System.out.println(" The Result is: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
			System.out.print("\n");
		}
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				for(k=0;k<3;k++)
				{
					d[i][j]+=a[i][k]*b[k][j];
				}
				
			}
			
		}
		System.out.println("\n");
		System.out.println(" After Multiplication of the Matrices..");
		System.out.println(" The Result is: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("\t"+d[i][j]);
			}
			System.out.print("\n");
		}
	}

}
