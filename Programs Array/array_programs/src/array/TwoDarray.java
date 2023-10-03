package array;
import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the order of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];

		System.out.println("Enter the "+(row*col)+" elements");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered matrix is :");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		//========================================================

		getSpiralOrderAnti(mat);

		//========================================================

		getSpiralOrder(mat);

		//========================================================

		rotate90Left(mat);

		//========================================================

		rotate90Right(mat);

		//========================================================

		//getColWiseBiggestSmallest(mat);

		//========================================================

		//getRowWiseBiggestSmallest(mat);

		//========================================================

		//getDiagonalWiseReverse(mat);

		//========================================================

		//getColWiseRev(mat);

		//========================================================

		//getRowWiseRev(mat);

		//========================================================

		//getColWiseSum(mat);

		//========================================================

		//getRowWiseSum(mat);

		//========================================================

		//getDiagonalWiseBiggest(mat);

		//========================================================

		//getBiggestInCol(mat);

		//========================================================

		//getBiggestInRow(mat);

		//========================================================

		//countEvenOdd(mat);

		//========================================================

		/*
			System.out.println("Transpose of a matrix :");
			mat = getTransposeMatrix(mat);
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[i].length;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		 */

		//========================================================

		/*
			int prime = getNumberOfPrime(mat);
			System.out.println("Prime Numbers present is :"+prime);
		 */

		//========================================================

		/*
			int sum = getSumOfMatrix(mat);
			System.out.println("The sum of all elements is :"+sum);
		 */

		//========================================================

		/*
			System.out.println("Enter the order of second matrix");
			int row2 = sc.nextInt();
			int col2 = sc.nextInt();
			int[][] mat2 = new int[row2][col2];

			System.out.println("Enter the "+(row2*col2)+" elements");
			for(int i=0;i<mat2.length;i++) {
				for(int j=0;j<mat2[i].length;j++) {
					mat2[i][j] = sc.nextInt();
				}
			}

			System.out.println("Entered second matrix is :");
			for(int i=0;i<mat2.length;i++) {
				for(int j=0;j<mat2[i].length;j++) {
					System.out.print(mat2[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();

			if(row!=row2 || col!=col2) {
				System.out.println("Addition Faild!!!");
				System.exit(0);
			}

			mat = addTwoMatrix(mat,mat2);
			System.out.println("The added matrix is :");
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[i].length;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		 */

		//========================================================

		/*
			int big = getBiggest(mat);
			System.out.println(big+" is the biggest element");
		 */

		//========================================================

		sc.close();
	}

	private static void getSpiralOrderAnti(int[][] mat) {
		for(int i=0,j=mat.length-1;i<j;i++,j--) {

			for(int k=i;k<j;k++) {
				System.out.print(mat[k][i]+" ");
			}
			for(int k=i;k<j;k++) {
				System.out.print(mat[j][k]+" ");
			}
			for(int k=j;k>i;k--) {
				System.out.print(mat[k][j]+" ");
			}
			for(int k=j;k>i;k--) {
				System.out.print(mat[i][k]+" ");
			}
		}
		int n=mat.length;
		if(n%2==1)
			System.out.println(mat[n/2][n/2]);

	}

	private static void getSpiralOrder(int[][] mat) {
		for(int i=0,j=mat.length-1;i<j;i++,j--) {

			for(int k=i;k<j;k++) {
				System.out.print(mat[i][k]+" ");
			}
			for(int k=i;k<j;k++) {
				System.out.print(mat[k][j]+" ");
			}
			for(int k=j;k>i;k--) {
				System.out.print(mat[j][k]+" ");
			}
			for(int k=j;k>i;k--) {
				System.out.print(mat[k][i]+" ");
			}
		}
		int n=mat.length;
		if(n%2==1)
			System.out.println(mat[n/2][n/2]);

	}

	private static void rotate90Left(int[][] mat) {
		int[][] tmat = new int[mat[0].length][mat.length];
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				tmat[i][j]=mat[j][i];
			}
		}
		for(int i=0;i<mat[0].length;i++) {
			int f=0,l=mat.length-1;
			while(f<l) {
				int temp=tmat[f][i];
				tmat[f][i]=tmat[l][i];
				tmat[l][i]=temp;
				f++;
				l--;
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(tmat[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void rotate90Right(int[][] mat) {
		int[][] tmat = new int[mat[0].length][mat.length];
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				tmat[i][j]=mat[j][i];
			}
		}
		for(int i=0;i<mat.length;i++) {
			int f=0,l=mat[i].length-1;
			while(f<l) {
				int temp=tmat[i][f];
				tmat[i][f]=tmat[i][l];
				tmat[i][l]=temp;
				f++;
				l--;
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(tmat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void getColWiseBiggestSmallest(int[][] mat) {
		int[] b = new int[mat[0].length];
		int[] s = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++) {
			int big=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
			for(int j=0;j<mat.length;j++) {
				if(big<mat[j][i])
					big = mat[j][i];
			}
			b[i] = big;

			for(int j=0;j<mat.length;j++) {
				if(small>mat[j][i])
					small = mat[j][i];
			}
			s[i] = small;
		}

		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+" ");

	}

	private static void getRowWiseBiggestSmallest(int[][] mat) {
		int[] b = new int[mat.length];
		int[] s = new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			int big=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
			for(int j=0;j<mat[i].length;j++) {
				if(big<mat[i][j])
					big = mat[i][j];
			}
			b[i] = big;

			for(int j=0;j<mat[i].length;j++) {
				if(small>mat[i][j])
					small = mat[i][j];
			}
			s[i] = small;
		}

		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+" ");

	}

	private static void getDiagonalWiseReverse(int[][] mat) {
		int l=mat.length-1,f=0;
		while(f<l) {
			int temp=mat[f][f];
			mat[f][f]=mat[l][l];
			mat[l][l]=temp;

			temp=mat[f][l];
			mat[f][l]=mat[l][f];
			mat[l][f]=temp;

			f++;
			l--;
		}

		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void getColWiseRev(int[][] mat) {
		for(int i=0;i<mat[0].length;i++) {
			int f=0,l=mat.length-1;
			while(f<l) {
				int temp=mat[f][i];
				mat[f][i]=mat[l][i];
				mat[l][i]=temp;
				f++;
				l--;
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void getRowWiseRev(int[][] mat) {

		for(int i=0;i<mat.length;i++) {
			int f=0,l=mat[i].length-1;
			while(f<l) {
				int temp=mat[i][f];
				mat[i][f]=mat[i][l];
				mat[i][l]=temp;
				f++;
				l--;
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void getColWiseSum(int[][] mat) {

		int[] a = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++) {
			int sum = 0;
			for(int j=0;j<mat.length;j++) {
				sum+=mat[j][i];
			}
			a[i] = sum;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	private static void getRowWiseSum(int[][] mat) {

		int[] a = new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			int sum=0;
			for(int j=0;j<mat[0].length;j++) {
				sum+=mat[i][j];
			}
			a[i] = sum;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	private static void getDiagonalWiseBiggest(int[][] mat) {
		if(mat.length!=mat[0].length) {
			System.out.println("Search Faild!!!");
			System.exit(0);
		}

		int big=Integer.MIN_VALUE,sbig=Integer.MIN_VALUE,n=mat[0].length-1;
		for(int i=0;i<mat.length;i++) {
			if(big<mat[i][i])
				big=mat[i][i];

			if(sbig<mat[i][n-i])
				sbig=mat[i][n-i];
		}
		System.out.println("Primary Diagonal Biggest :"+big);
		System.out.println("Secondary Diagonal Biggest :"+sbig);
	}

	private static void getBiggestInCol(int[][] mat) {
		int[] bigg = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++) {
			int big=Integer.MIN_VALUE;
			for(int j=0;j<mat.length;j++) {
				if(big<mat[j][i])
					big = mat[j][i];
			}
			bigg[i] = big;
		}

		for(int i=0;i<bigg.length;i++)
			System.out.print(bigg[i]+" ");

	}

	private static void getBiggestInRow(int[][] mat) {
		int[] bigg = new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			int big=Integer.MIN_VALUE;
			for(int j=0;j<mat[i].length;j++) {
				if(big<mat[i][j])
					big = mat[i][j];
			}
			bigg[i] = big;
		}

		for(int i=0;i<bigg.length;i++)
			System.out.print(bigg[i]+" ");
	}

	private static void countEvenOdd(int[][] mat) {
		int ec=0,oc=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		System.out.println("The number of even and odd is :"+ec+" "+oc);
	}

	private static int[][] getTransposeMatrix(int[][] mat) {
		int[][] tmat =new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				tmat[j][i] = mat[i][j]; 
			}
		}
		return tmat;
	}

	private static int getNumberOfPrime(int[][] mat) {
		int count=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				boolean rs = getPrimeNumber(mat[i][j]);
				if(rs) {
					count++;
					System.out.println(mat[i][j]);
				}
			}
		}
		return count;
	}

	private static boolean getPrimeNumber(int mat) {
		for(int i=2;i<mat/2;i++) {
			if(mat%i==0)
				return false;
		}
		return true;
	}

	private static int getSumOfMatrix(int[][] mat) {
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				sum+=mat[i][j];
			}
		}
		return sum;
	}

	private static int[][] addTwoMatrix(int[][] mat, int[][] mat2) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=mat[i][j]+mat2[i][j];
			}
		}
		return mat;
	}

	private static int getBiggest(int[][] mat) {
		int big=Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(big<mat[i][j])
					big = mat[i][j];
			}
		}
		return big;
	}

}

