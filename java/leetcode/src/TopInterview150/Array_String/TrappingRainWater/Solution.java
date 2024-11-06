package TopInterview150.Array_String.TrappingRainWater;

class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int water = 0;
        int top = 0;
        for(int i = 0; i < height.length; i++){
            top = height[i] > height[top] ? i : top;
        }

        int left = 0;
        for(int i = 0; i <= top; i++){
            left = height[i] > left ? height[i] : left;
            water += left;
            sum += height[i];
        }
        int right = 0;
        for(int i = height.length - 1; i > top; i--){
            right = height[i] > right ? height[i] : right;
            water += right;
            sum += height[i];
        }

        return water - sum;
    }

     public int limitExceeded1(int[] height) {
         int sum = 0;
         int high = 1;
         int top = 0;
         for(int i : height){
             top = i > top ? i : top;
         }

         while(high <= top){
             int left = 0;
             for(int i = 0; i < height.length; i++){
                 if(height[i] >= high && left != i){
                     if(height[left] >= high){
                         sum += i - left - 1;
                     }
                     left = i;
                 }
             }

             high++;
         }

         return sum;
     }
}