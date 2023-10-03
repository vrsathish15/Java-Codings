package programs;

public class Array {
	public static void main(String[] args) {

		int[] a= {2,-6,3,4,5,-1,6,7,9,2,9,10,-28};
		int[] b= {22,9,3,33,78,24,9,2,3};
		int[] c= {2};


		getprimecount(a);   //PRIME NUMBER
		getBig(a);			//BIG NUMBER FROM ARRAY
		getsmall(a);		//SMALLEST NUMBER
		getnegative(a);		//TO GET NEGATIVE ELEMENT FROM ARRAY
		mergetwoarray(a,b); //TO MERGE TWO ELEMENT 
		printdigit(b);		//PRINT DIGITS FROM ARRAY LIST
		sumofdigits(b);		//SUM OF DIGIT IN A ARRAY
		secondbig(b);		//TO FIND SECOND LARGEST NUMBER
		secondsmallest(a);

	}
	//SECOND SMALLEST
	private static void secondsmallest(int[] b) {
		System.out.println("SECOND SMALL : ");
		int fsmall=Integer.MAX_VALUE, ssmall=Integer.MAX_VALUE;
		for(int i=0;i<b.length;i++) {
			if(b[i]<fsmall) {
				ssmall=fsmall;
				fsmall=b[i];
			}
			
		
			else if(b[i]<ssmall && b[i]!=fsmall) {
				ssmall=b[i];
			}
			if(ssmall==Integer.MAX_VALUE) {
				System.out.println("No second small");
				System.exit(0);
			}
		}
		System.out.println(ssmall);

	}
	//MERGE TWO ARRAY
	private static void mergetwoarray(int[] a, int[] b) {
		System.out.println("merged two array");

		int[] x=new int[a.length+b.length];

		for(int i=0;i<a.length;i++) {
			x[i]=a[i];
		} 
		for(int i=0;i<b.length;i++) {
			x[a.length+i]=b[i];
		}

		for(int c:x) {

			System.out.print(c+" ");

		}

	}
	// SECOND BIG ELEMENT
	private static void secondbig(int[] a) {
		System.out.print("\nsecond big: ");
		int fbig=Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>fbig) {
				sbig=fbig;
				fbig=a[i];

			}
			else if(a[i]>sbig && fbig!=a[i]){
				sbig=a[i];
			}
			if(sbig==Integer.MIN_VALUE) {
				System.out.println("No second big ");
				System.exit(0);
			}


		}
		System.out.println(sbig);

	}
	// SUM OF DIGIT
	private static void sumofdigits(int[] b) {
		System.out.print("\nsum of digits:");
		int sum=0;
		for(int a:b) {
			if(a<=9&&a>0)
				sum =sum+a;
		}
		System.out.print(sum);
	}
	//PRINT DIGIT
	private static void printdigit(int[] b) {
		System.out.print("\ndigits in array:");
		for(int i=0;i<b.length;i++) {
			if(b[i]>0 && b[i]<=9) {
				System.out.print(b[i]+",");
			}
		}
	}
	// NEGATIVE ELEMENT
	private static void getnegative(int[] a) {
		System.out.println("negative elements from array");
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0)
				System.out.println(a[i]);
		}


	}
	//SMALL ELEMENT
	private static void getsmall(int[] a) {
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small)
				small=a[i];
		}
		System.out.println(small);

	}
	//BIGGEST ELEMENT
	private static void getBig(int[] n) {
		System.out.println("biggest element from array:");
		int big=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>big)
				big=n[i];
		}
		System.out.println(big);
	}

	private static void getprimecount(int[] n) {

		int sum=0; int count=0;
		for(int a:n) {
			if(isprime(a)) {
				System.out.print(a+" ");
				sum +=a;
				count++;
			}	
		}

		System.out.println( "\nSum of Prime numbers in a Array: "+ sum);
		System.out.println("NO.Of Prime no In Array: "+count);


	}


	// IS PRIME NO OR NOT
	private static boolean isprime(int a) {
		if(a==0|a==1) return false;
		else {
			for (int i=2;i<a;i++) {
				if(a%i==0)
					return false;
			}
		}

		return true;
	}





}
