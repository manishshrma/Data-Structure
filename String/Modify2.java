package manish;

public class Modify2 {
	public static void main(String[] args)
	{
		StringBuilder str=new StringBuilder("acbda");
		int i;
		/*StringBuilder str=new StringBuilder("acbda");
		StringBuilder str2=new StrngBuilder();
		int gap=0;int i;
		for(i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
		   char c1=str.charAt(i+1);
		int gap=ch-ch1;
		str.append(c);
		str2.append(gap)
	//	System.out.println(gap);
		}
		nsb.append(str.charAt(str.length()-1));
		System.out.println(str2);*/
		for(i=0;i<str.length()-1;i++)
		{
		   char c= str.charAt(i);
		   char c1=str.charAt(i+1);
		System.out.print(c);
		int gap=c-c1;
		System.out.print(gap);
		}
		
	}
}
		
