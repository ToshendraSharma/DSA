package Sorting_Algo;
import java.util.*;
public class Merge_Sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(0,n-1,arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
    public static void mergesort(int i,int j,int[] arr){
        if(i>=j){
            return;
        }
        int mid=(i+j)/2;
        mergesort(i,mid,arr);
        mergesort(mid+1,j,arr);
        merge(arr,i,mid,j);
    }
    static void merge(int [] arr,int i,int mid,int j) {
        int left = i;
        int right = mid + 1;
        int k = 0;
        int temp[] = new int[j-i+1];
        while (left <= mid && right <= j ) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
                k++;
            } else if (arr[left] >= arr[right]) {
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }
        while (right <=j) {
            temp[k] = arr[right];
            k++;
            right++;
        }
        for(int l=0;l<temp.length;l++){
            arr[l+i]=temp[l];
        }
    }
}
