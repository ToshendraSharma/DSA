package test;
import java.util.*;
public class XOROPRATION {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        list.add(c);
        for(int i=0;i<n;i++){
            c=c^arr[i];
            list.add(c);
        }
        for(int num:list){
            System.out.println(num);
        }
    }
}
