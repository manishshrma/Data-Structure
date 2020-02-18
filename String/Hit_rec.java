package manish;

import java.util.Scanner;

public class Hit_rec {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		StringBuilder sb = new StringBuilder();
		int i = s.length() - 1;
		int count=0;
		int index=scr.nextInt();

		String str = remove(s,sb,count);
		System.out.println(str.charAt(index));

		System.out.println(str);

	}

	public static String remove(String s,StringBuilder sb,int count) {

		if (s.length() < 2) {
		//	System.out.print(s);
			//return s.substring(0);
		return(	sb.append(s).toString());
			//return sb.toString();
			//return sb.toString()+s;

		}
		String str = s.substring(0, 2);

		if (str.equals("hi")) {
			sb.append("pep");
			
			String ros=s.substring(2);
			//String x= sb.toString()+ros;
		return(	remove(ros,sb,count));

		//	return(x);
		} else
		{
			
			
			String ros=s.substring(1);

			char ch = s.charAt(0);
			sb.append(ch);
			remove(ros,sb,count);

			return sb.toString();
		}
	}
}




