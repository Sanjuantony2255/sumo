import java.util.*;
class Symmetric
{

	public static void main(String args[])
	{
	
		Scanner obj = new Scanner(System.in);
		int[][] a=new int[5][5];
		int[][] b=new int[5][5];
		int i,j,m,n,flag=0;
		System.out.println("Enter row of matrices:");
		m= obj.nextInt();
		System.out.println("Enter column of matrices:");
		n= obj.nextInt();
		System.out.println("Enter matrix:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=obj.nextInt();
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				b[j][i]=a[i][j];
				if(a[i][j]!=b[j][i])
					flag=1;
			}
		}
		if(flag==1)
			System.out.println("Matrix is not symmetric.");
		else
			System.out.println("Matrix is symmetric.");
	}
}
