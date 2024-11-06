package TopInterview150.Array_String.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
        char[] c = strs[0].toCharArray();
        int index = 0;
        String result = "";
        String temp = "";
        boolean change = c.length > 0 ? true : false;
        while(change){
            temp += String.valueOf(c[index]);
            for(int i = 0; i < strs.length; i++){
                if(!strs[i].startsWith(temp)){
                    change = false;
                    break;
                }
            }
            result = change ? temp : result;
            if(++index >= c.length){
                break;
            }
        }

        return result;
    }
}