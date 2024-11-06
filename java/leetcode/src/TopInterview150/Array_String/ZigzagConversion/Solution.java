package TopInterview150.Array_String.ZigzagConversion;

class Solution {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        String[] strings = new String[numRows];
        String result = "";
        for(int i = 0; i < numRows; i++){
            strings[i] = "";
        }
        int a = 0;
        int b = numRows == 1 ? 0 : 1;
        for(int i = 0; i < chars.length; i++){
            strings[a] += String.valueOf(chars[i]);
            a += b;
            if(numRows == 1){
                continue;
            }else if(a == 0){
                b = 1;
            }else if(a == numRows - 1){
                b = -1;
            }
        }
        for(String t : strings){
            result += t;
        }
        return result;
    }
}