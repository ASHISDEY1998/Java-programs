import java.util.Scanner;

public class Matrix {
	public int[][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row and colum you want ro enter");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter "+r*c+" element row wise for matrix");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
public void dispMat(int mat[][])
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public int[][] addMat(int x[][], int y[][])
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("Matrix missmach");
			return null;
		}
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}

	public int bigMat(int[][] x) 
	{
		int big=x[0][0];
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				if (x[i][j] > big) { 
                    big = x[i][j]; 
                } 
			}
		}
		return big;
	}

	public int[] countEO(int[][] x) 
	{
		int y[]= {0,0};
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				if(x[i][j]%2==0)
					y[0]++;
				else
					y[1]++;
			}
		}
		return y;
	}

	public int sumEleMat(int[][] x)
	{
		int sum=0;
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				 sum=sum+x[i][j];
			}
		}
		return sum;
	}

	public int countPrime(int[][] x) 
	{
		int count=0;
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				 boolean y=isPrime(x[i][j]);
				 if(y==true)
					 count++;
			}
		}
		return count;
	}

	private boolean isPrime(int i) 
	{
		int j=0;
		while (j<=i/2)
		{
			if(i%2==0)
				return false;
			j++;
		}
		return true;
	}

	public int[][] transposeMat(int[][] x) 
	{
		int y[][]=new int[x[0].length][x.length];
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				y[j][i] = x[i][j];
			}
		}
		return y;
	}

	public int[][] reverseRowMat(int[][] x) 
	{
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length/2; j++) 
			{
				int t=x[i][j];
				x[i][j]=x[i][x[i].length-1-j];
				x[i][x[i].length-1-j]=t;
			}
		}
		return x;
	}

	public int[][] reverseColomnMat(int[][] x)
	{
		for (int i = 0; i < x.length/2; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				int t=x[i][j];
				x[i][j]=x[x.length-1-i][j];
				x[x.length-1-i][j]=t;
			}
		}
		return x;
		
	}

	public int[][] rotate90degleftMat(int[][] x) 
	{
		int y[][]=transposeMat(x);
		int z[][]=reverseColomnMat(y);
		return z;
	}

	public int[][] rotate90degrightMat(int[][] x) {
		int y[][]=transposeMat(x);
		int z[][]=reverseRowMat(y);
		return z;
	}

	public int[] rowWiseBiggest(int[][] x) 
	{
		int big[]=new int[x.length];
		for (int i = 0; i < x.length; i++) 
		{
			big[i]=x[i][0];
			for (int j = 1; j < x[i].length; j++) 
			{
				if(big[i]<x[i][j])
					big[i]=x[i][j];
			}
		}
		return big;
	}

	public int[] colomnWiseBiggest(int[][] x) 
	{
		int y[][]=transposeMat(x);
		int z[]=rowWiseBiggest(y);
		return z;
		/* int big[]=new int[a[0].length];
			for(int i=0;i<a[0].length;i++)
			{
				big [i]=[0][i];
				for(int j=1;j<a.length;j++)
				{
					if(big[i]<a[j][i])
					big[i]==a[j][i];
				}
			}
			return big;
		 */
	}

	public int[] rowWiseSum(int[][] x) {
		int sum[]=new int[x.length];
		for (int i = 0; i < x.length; i++) 
		{
			sum[i]=0;
			for (int j = 0; j < x[i].length; j++) 
			{
				sum[i]=sum[i]+x[i][j];
			}
		}
		return sum;
	}

	public int[] colomnWiseSum(int[][] x) {
		int y[][]=transposeMat(x);
		int z[]=rowWiseSum(y);
		return z;
		
//		int sum[]=new int[x[0].length];
//		for (int i = 0; i < x[0].length; i++) 
//		{
//			sum[i]=0;
//			for (int j = 0; j < x.length; j++) 
//			{
//				sum[i]=sum[i]+x[j][i];
//			}
//		}
//		return sum;
	}

	public int[] rowWiseSmallest(int[][] x) {
		int smallest[]=new int[x.length];
		for (int i = 0; i < x.length; i++) 
		{
			smallest[i]=x[i][0];
			for (int j = 1; j < x[i].length; j++) 
			{
				if(smallest[i]>x[i][j])
					smallest[i]=x[i][j];
			}
		}
		return smallest;
	}

	public int[] colomnWiseSmallest(int[][] x) {
		int y[][]=transposeMat(x);
		int z[]=rowWiseSmallest(y);
		return z;
	}

	public int[] digonalyBiggest(int[][] x) 
	{
		int pBig=x[0][0];
		int sBig=x[0][x[0].length-1];
		for (int i = 0; i < x.length; i++) 
		{
			
			for (int j = 1; j < x[i].length; j++) 
			{
				if(i==j)
				{
					if(x[i][j]>pBig)
						pBig=x[i][j];
				}
				if(i+j==x.length-1)
				{
					if(x[i][j]>sBig)
						sBig=x[i][j];
				}
			}
		}
		 int big[]= {pBig,sBig};
		 return big;
	}

	public void digonalyReverse(int[][] x) 
	{
		int n=x.length;
		for (int i = 0; i < n/2; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(i==j)
				{
					int t=x[i][j];
					x[i][j]=x[n-1-i][n-1-i];
					x[n-1-i][n-1-i]=t;
				}
				
				if(i+j==n-1)
				{
					int t=x[i][j];
					x[i][j]=x[j][i];
					x[j][i]=t;
				}
			}
		}
		
	}

	public void displaySpiral(int[][] x) 
	{
		int n=x.length;
	
		for (int i = 0, j=n-1; i<j ; j--, i++) 
		{
			for (int k = 0; k < x.length; k++)
			{
				System.out.println(x[i][]);
			}
		}
		
	}
}
