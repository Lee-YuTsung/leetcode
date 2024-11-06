package TopInterview150.Array_String.MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == (m + n) && nums2.length == n){
            for(int i = 0; i < n; i++){
                nums1[i + m] = nums2[i];
            }
            boolean check = false;
            do{
                check = false;
                for(int i = 0; i < nums1.length - 1; i++){
                    if(nums1[i] > nums1[i + 1]){
                        int temp = nums1[i];
                        nums1[i] = nums1[i + 1];
                        nums1[i + 1] = temp;
                        check = true;
                    }
                }
            }while(check);
        }
    }
}
