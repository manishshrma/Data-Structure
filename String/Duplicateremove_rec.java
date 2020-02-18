package manish;

import java.util.Scanner;

public class Duplicateremove_rec {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String s=scr.next();
		char find=scr.next().charAt(0);
	//	s.toLowerCase();

		int i=scr.nextInt();
		StringBuilder sb=new StringBuilder();
		
		
	//    duplicate(s,sb);
		int count=0;
	    String str=duplicate(s,sb,find,count);
	    System.out.println(str.charAt(i));

	    System.out.println(str);

	//	 System.out.println(duplicate(s,sb));
		 

		
		
		
	}
	public static String duplicate(String s,StringBuilder sb,char find,int count)
	{
//		if(s.length()-1==0)
//			return sb.toString();
//		
		if(s.length()==1){
			sb.append(s.charAt(s.length()-1));

			for(int i=0;i<count;i++)
			{
				sb.append(find);
			}
			return sb.toString();
	}
		char ch=s.charAt(0);
	//	char ch2=s.charAt(1);
		String ros=s.substring(1);
		if(ch!=find)
		{
			sb.append(ch);	
		}
		else
		{
			count++;
		}
		duplicate(ros,sb,find,count);
		
		return sb.toString();
		
		
		
		
	}

}
