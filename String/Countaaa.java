package manish;

import java.util.Scanner;

public class Countaaa {
	public static void main(String[] args) {
		int counts=0;
		Scanner scr=new Scanner(System.in);
		String s=scr.next();
		count1(s,counts);
		count2(s,counts);
		
		
		
		
	}
	
	public static void count1(String s,int counts)
	{
		if(s.length()<3)
		{
			System.out.println(counts);
			return;
		}
		String str=s.substring(0, 3);

		
		
		 if(str.equals("aaa"))
		{
			counts++;
			String ros=s.substring(1);
			count1(ros,counts);
		}
		
		
	}
	public static void count2(String s,int counts)
	{
		if(s.length()<3)
		{
			System.out.println(counts);
			return;
		}
		String str=s.substring(0, 3);

		
		
		 if(str.equals("aaa"))
		{
			counts++;
			String ros=s.substring(3);
			count1(ros,counts);
		}
	}

}
