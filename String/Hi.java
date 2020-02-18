package manish;

import java.util.Scanner;

public class Hi {
	public static void main(String[] args) {
		int count = 0;
		Scanner scr = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = new String();
		s = scr.next();
		int i = 0, k = 0;
		int j = i + 1;

		// String s="hihihijjhihi";int count=0;
	//	duplicate(s, 0, count);
		System.out.println(duplicate2(s, sb, i, j, k));//duplicate2(s, sb, i, j, k);

	}

//	public static void duplicate(String s, int i, int count) {
//		if (i == s.length() - 1) {
//			System.out.println(count);
//			return;
//		}
//		if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
//			count++;
//		}
//		// if(s.charAt(k)!='h'||s.charAt(l)!='i')
//		// {
//		//
//		// x[i]=s.charAt(k);
//		// x[i+1]=s.charAt(l);
//		// }
//
//		duplicate(s, i + 1, count);
//
//	}

//	public static String duplicate2(String s, StringBuilder sb, int i, int j, int k) {
//
//		if(s.length()%2==0){
//		if (j == s.length() -1) {
//			return sb.toString();
//		}
//		}
//		else
//		{
//			if(s.length()%2!=0)
//			{
//				if (j == s.length() -2) {
//				//	sb.append(ch3);
//					return sb.toString();
//				}
//				}	
//			}
//			
//		if (s.charAt(i) != 'h' || s.charAt(j) != 'i') {
//			char ch1 = s.charAt(i);
//			char ch2 = s.charAt(j);
//			char ch3=s.charAt(s.length()-1);
//
//			sb.append(ch1);
//			sb.append(ch2);
//		}
//		duplicate2(s, sb, i + 2, j + 2, k + 2);
//		return sb.toString();
//	}
	public static String duplicate2(String s, StringBuilder sb, int i, int j, int k) {	
		if(s.length()%2==0){
			if (j == s.length() -1) {
			return sb.toString();
			}
			if(s.length()%2!=0)
				{
					if (j == s.length() -2) {
					//	sb.append(ch3);
						return sb.toString();
					}
					}	
				}
			
		if (s.charAt(i) != 'h' || s.charAt(j) != 'i') {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);

			char ch3=s.charAt(s.length()-1);

			sb.append(ch1);
			duplicate2(s,sb,i+1,j+1,k);

			//sb.append(ch2);
		}
		if (s.charAt(i) =='h' && s.charAt(j) == 'i') {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			duplicate2(s,sb,i+2,j+2,k);
		//	char ch3=s.charAt(s.length()-1);

//			sb.append(ch1);
//			sb.append(ch2);
		}
		
	//	duplicate2(s, sb, i + 2, j + 2, k + 2);
		return sb.toString();
	}
	

}
