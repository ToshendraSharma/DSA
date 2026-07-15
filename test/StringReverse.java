package test;
import java .util.*;
public class StringReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] s=str.split("\\s+");
        String temp="";
        for(int i=0;i<s.length;i++){
            String rev="";
            for(int j=s[i].length()-1;j>=0;j--){
                rev+=s[i].charAt(j);
            }
            temp+= rev+" ";
        }
        System.out.println(temp.trim());
    }
}
