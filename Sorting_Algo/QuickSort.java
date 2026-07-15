package Sorting_Algo;
import java.util.*;
public class QuickSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(0,n-1,arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void sort(int low,int high,int [] arr) {
        if (low >= high) return;
        int s = low;
        int e = high;
        int m = (s + e) / 2;
        int piv = arr[m];
        while (s <= e) {
            while (arr[s] < piv) {
                s++;
            }
            while (arr[e] > piv) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
            sort(s, high, arr);
            sort(low, e, arr);
    }
}
