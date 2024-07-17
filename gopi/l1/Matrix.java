import java.util.*;
class Matrix
{

	public static void main(String args[])
	{

	Scanner obj = new Scanner(System.in);
	int[][] a=new int[5][5];
	int[][] b=new int[5][5];
	int[][] c=new int[5][5];

		int i,j,m,n;
		System.out.println("Enter row of matrices:");
		m= obj.nextInt();
		System.out.println("Enter column of matrices:");
		n= obj.nextInt();
		System.out.println("Enter matrix 1:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter matrix 2:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				b[i][j]=obj.nextInt();
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum matrix:-");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]+"\n");
			}
			System.out.println();
		}

	}
}
