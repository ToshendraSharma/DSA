package Stack;

import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Ele2 {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map =new HashMap<>();
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<nums2.length;i++){
         while(!st.isEmpty()&&nums2[i]>st.peek()){
           int store=st.pop() ; 
           map.put(store,nums2[i]);
         }
         st.push(nums2[i]);
       }
       while(!st.isEmpty()){
        int gt=st.pop();
        map.put(gt,-1);
       }
       int arr[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        arr[i]=map.get(nums1[i]);
       }
       return arr;
    }
}
    

