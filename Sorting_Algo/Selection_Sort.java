package Sorting_Algo;
import java.util.*;
public class Selection_Sort {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] <arr [min]) {
                    min = j;
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
