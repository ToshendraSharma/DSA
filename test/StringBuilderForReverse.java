package test;
import java.util.*;
public class StringBuilderForReverse
{
    public static void main(String[] arges){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.trim().split("\\s+");
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<str.length;i++){
            String rev=new StringBuilder(str[i]).reverse().toString();
            temp.append(rev).append(" ");
        }
        System.out.println(temp);
    }
}
