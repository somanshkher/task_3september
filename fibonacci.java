package task;

public class fibonacci {

	public static void main(String[] args) {

        int t1 = 0, t2 = 1, sum=0;
       System.out.print("0 1 ");

        for(int i=1;i<200;i++)
        {
        	sum = t1 + t2;
        	if(sum<200){
        	
        	System.out.print(sum + "  ");

            
            t1 = t2;
            t2 = sum;
        	}
        }
    }
}
