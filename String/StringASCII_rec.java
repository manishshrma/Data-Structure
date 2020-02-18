package manish;

import java.util.ArrayList;

public class StringASCII_rec {
	public static void main(String[] args) {

		ArrayList<String> list = getSS("abc");
//		System.out.println(list);
//		ArrayList<String> list2 = getSS2("ab");
//		System.out.println(list2);
//		ArrayList<String> list3 = path(8, 10);
//		System.out.print(list3);
//		path(7,10,"");

	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("-");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);// bc
		// faith//
		ArrayList<String> rresult = getSS(ros);

		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			mresult.add(rstr);
         //	System.out.println(mresult);
	         mresult.add(ch + rstr);

		}
		return mresult;
	}

	public static ArrayList<String> getSS2(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add(" ");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);// bc
		// faith//
		ArrayList<String> rresult = getSS2(ros);

		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			mresult.add(rstr);
			mresult.add(ch + rstr);
			mresult.add((int) ch + rstr);
		}
		return mresult;

	}


//	public static ArrayList<String> path(int s, int d) {
//		if (s == d) {
//			ArrayList<String> br = new ArrayList<>();
//			br.add("_");
//			return br;
//		}
//		if (s > d) {
//			ArrayList<String> br = new ArrayList<>();
//			return br;
//
//		}
//		ArrayList<String> myresult = new ArrayList();
//
//		for (int dice = 1; dice <= 6; dice++) {
//
//			int i = s + dice;
//			
//			ArrayList<String> pathfromitod = path(i, d);
//			for (String pat : pathfromitod) {
//				myresult.add(dice + pat);
//			}
//
//		}
//		return myresult;
//	}
public static void path(int s,int d,String psf)
{
	if(s==d)
	{
		System.out.println(psf);
	return;
	}
	if(s>d){
		return;
	}
	for(int dice=1;dice<=6;dice++)
	{
		
		if(s<=d)
		{
			int inter=s+dice;
		path(inter,d,psf+dice);
		}
	}
	
}
}
