package TopInterview150.Array_String.RemoveDuplicatesfromSortedArrayII;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int index = 0;
        int amount = 0;
        int target = nums[0];

        for(int i = 0; i < nums.length; i++){
            amount = nums[i] == target ? amount + 1 : 1;
            target = nums[i] == target ? target : nums[i];

            if(amount >= 3){
                continue;
            }
            nums[index] = nums[i];
            index++;
            count++;
        }

        return count;
    }
}