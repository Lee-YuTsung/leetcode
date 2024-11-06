package TopInterview150.Array_String.ReverseWordsinaString;

class Solution {
    public String reverseWords(String s) {
        String[] sub = s.trim().split(" +");
        String result = "";
        for(int i = sub.length - 1; i >= 0; i--){
            result += i - 1 >= 0 ? sub[i] + " " : sub[i];
        }
        return result;
    }
}