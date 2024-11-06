package TopInterview150.Array_String.LengthofLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        char[] c = s.trim().toCharArray();
        int leng = 0;
        for(int i = c.length - 1; i >= 0; i--){
            if(c[i] != ' '){
                leng++;
            }else{
                break;
            }
        }
        return leng;
    }
}