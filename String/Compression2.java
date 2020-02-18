package manish;

public class Compression2 {
	public static void main(String[] args)
	{
		
		int i,count=0;
		StringBuilder str=new StringBuilder("aabbbbccdefff");
		for(i=0;i<str.length()-1;i++)
		{
			char c1=str.charAt(i);
			char c2=str.charAt(i+1);
			if(c1!=c2)
			{
				System.out.print(c1);
				
		
					if(count>0)
				System.out.print(count+1);
				count=0;
				
			}
			
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.print(str.charAt(str.length()-1));
		System.out.print(count);
	}

}
