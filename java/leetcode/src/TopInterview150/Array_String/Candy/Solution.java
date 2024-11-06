package TopInterview150.Array_String.Candy;

class Solution {
    public int candy(int[] ratings) {
        int total = 0;

        for(int i = 0; i < ratings.length; i++){
            total += compare(ratings, i);
        }

        return total;
    }

    public int leftCompare(int[] ratings, int root){
        int sum = 0;
        sum += root - 1 < 0 ? 0 : ratings[root] > ratings[root - 1] ? leftCompare(ratings, root - 1) + 1 : 0;
        return sum;
    }

    public int rightCompare(int[] ratings, int root){
        int sum = 0;
        sum += root + 1 > ratings.length - 1 ? 0 : ratings[root] > ratings[root + 1] ? rightCompare(ratings, root + 1) + 1 : 0;
        return sum;
    }

    public int compare(int[] ratings, int root){
        int sum = 1;

        if(root != 0 || root != ratings.length - 1){
            int left = leftCompare(ratings, root);
            int right = rightCompare(ratings, root);
            sum += left >= right ? left : right;
        }else if(root == 0){
            sum += rightCompare(ratings, root);
        }else{
            sum += leftCompare(ratings, root);
        }

        return sum;
    }
}