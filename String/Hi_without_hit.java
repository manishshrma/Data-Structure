package manish;

import java.util.Scanner;

public class Hi_without_hit {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		StringBuilder sb = new StringBuilder();
		int i = s.length() - 1;
		int count = 0;
		int index = scr.nextInt();

		String str = hit(s, sb, count);
		System.out.println(str.charAt(index));

		System.out.println(str);

	}

	public static String hit(String s, StringBuilder sb, int count) {
		if (s.length() <3) 
		{
			if(s.length()==1){
				sb.append(s.charAt(0));
			}else{
				if(s.equals("hi")){
					count++;
				}
				else{
					sb.append(s);
				}
			}
//			
					
			System.out.println(count);
			return sb.toString();

		}

		char ch = s.charAt(0);
		String str = s.substring(0, 3);
		String str2 = s.substring(0, 2);
		if (str.equals("hit")) {
			String ros = s.substring(3);
			sb.append("hit");

			return (hit(ros, sb, count));
		} else if (str2.equals("hi")) {
			count++;
			String ros = s.substring(2);
			return (hit(ros, sb, count));
		}

		else {
			String ros = s.substring(1);
			char ch2 = s.charAt(0);
			 sb.append(ch2);
			return (hit(ros, sb, count));
			// return sb.toString();

		}
	}
}
