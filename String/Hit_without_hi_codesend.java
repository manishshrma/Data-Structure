package manish;

import java.util.Scanner;

public class Hit_without_hi_codesend {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scn= new Scanner(System.in);
        String str=scn.next();
        int i=scn.nextInt();
        String s=removeHi(str,0);
        System.out.println(count);
     
        System.out.println(s.charAt(i));
     
           System.out.println(s);
        
    }
    static int count=0;
    public static String removeHi(String str,int idx){
        
        
        if(idx>=str.length()){
            String br="";
            return br;
        }
        if(idx==str.length()-1){
            String br=""+str.charAt(idx);
            return br;
        }
        if(idx==str.length()-2){
            if(str.substring(idx,idx+2).equals("hi")){
                count++;
                String rv=removeHi(str,idx+2);
                return rv;
            }
        }
        
        
        if(str.substring(idx,idx+2).equals("hi")&&!str.substring(idx,idx+3).equals("hit")){
            count++;
            String rv=removeHi(str,idx+2);
            return rv;
        }
        String rv=str.charAt(idx)+removeHi(str,idx+1);
        return rv;
    }


}
