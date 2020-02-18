package manish;

import java.util.ArrayList;

public class Comb_char_rec {
	
	public static void main(String[] args) {
		
		System.out.println(comb("01"));
		
	}
	static String[] codes1={"abc","de","fgh","ijkl","m","nop"};
	public static ArrayList<String> comb(String  codes)
	{

		if(codes.length()==0){
			ArrayList<String> br=new ArrayList<String>();
		     br.add(" ");
		     return br;
			}
		     char ch= codes.charAt(0);
		     String ros=codes.substring(1);
				ArrayList<String> mresult=new ArrayList<String>();
				String chcodes=codes1[ch-'0'];

		     
		     ArrayList<String>rresult=comb(ros);
		     for (String x: rresult)
		     {
		        for(int i=0;i<chcodes.length();i++)
		    	 {
		    	 mresult.add(chcodes.charAt(i)+x);
		    	
		        }
		     }
			     return mresult;
		
		
	}
		
}
