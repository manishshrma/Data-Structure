package manish;
import java.util.Scanner;
public class Strings {
	
	public static int fact(int n)
	{
        int ans=1;
		if(n==1)
			return 1;
		else
		{
			while(n>1)
			{
				ans=ans*n;
                n--;
			}
		}
		return ans;	
	}
	public static void main(String[] args)
	{
		        int i,j;
		        int a=1;int k;
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        int comb;
		        System.out.println(a);
		        for(i=1;i<=n;i++)
		        {
		            for(j=i;j>=1;j--)
		            {
		                int x=fact(i);
		            //    System.out.println(x);
		                int y=fact(i-j);
		                int z=fact(j);
		                comb=x/(y*z);
		                System.out.print(comb+" ");
		               		                
		            }
		            for(k=i;k<=i;k++)
	                {
	                	System.out.print(a);
	                }

		            System.out.println();
		        }
		    }
		}