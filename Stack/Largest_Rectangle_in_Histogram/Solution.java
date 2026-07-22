package Stack.Largest_Rectangle_in_Histogram;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int sum=0;
         for(int i=0;i<heights.length;i++){
        int num=fun(heights,i);
        int next=ele(heights,i);
         sum=Math.max(sum,heights[i]*(num+next-1));
          }
          return sum;
        
    }
   public int fun(int[] hig,int n){
    int num=hig[n];
    int idx=0;
    for(int i=n;i>=0;i--){
       if(num>hig[i])break;
       idx++;
    }
    return idx;
   }
   public int ele(int[] arr,int n){
    int idx=0;
    int num=arr[n];
    for(int i=n;i<arr.length;i++){
        if(num>arr[i])break;
        idx++;
    }
    return idx ;
   }
}

