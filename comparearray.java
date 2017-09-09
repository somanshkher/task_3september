package task;

public class comparearray {

	public comparearray() {
		
	}

	public static void main(String[] args) {
		int a[]={6, 3, 4, 2, 4, 5, 8};	
		int b[]={7, 4, 7, 4, 4, 5, 3, 7, 4};		
		int c, d;								
		c = a.length;		
		d = b.length;								
		
		
		if(c>d)					
		{
			System.out.println("A is the longer array");
			for(int i=0; i<c; i++)
				System.out.print(a[i]+ " ");
		}
		else if(c<d)
		{
			System.out.println("B is the longer array");
			for(int i=0; i<d; i++)
				System.out.print(b[i]+ " ");
		}
		else
		{
			System.out.println("Both String are of same length");
			System.out.print("String a[]:");
			for(int i=0; i<c; i++)
				System.out.print(a[i]+ " ");
			System.out.println();
			System.out.print("String b[]:");
			for(int x=0; x<d; x++)
				System.out.print(b[x]+ " ");
		}
}


	}


