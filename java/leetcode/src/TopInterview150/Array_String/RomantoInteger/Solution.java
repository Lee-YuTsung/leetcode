package TopInterview150.Array_String.RomantoInteger;

class Solution {
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int sum = 0;
        int n = array.length;
        for(int i = 0; i < n; i++){
            switch(array[i]){
                case 'I' : 
                    sum += i + 1 < n ? (array[i + 1] == 'V' || array[i + 1] == 'X') ? -1 : 1 : 1;
                    break;
                case 'V' : 
                    sum += 5;
                    break;
                case 'X' : 
                    sum += i + 1 < n ? (array[i + 1] == 'L' || array[i + 1] == 'C') ? -10 : 10 : 10;
                    break;
                case 'L' : 
                    sum += 50;
                    break;
                case 'C' : 
                    sum += i + 1 < n ? (array[i + 1] == 'D' || array[i + 1] == 'M') ? -100 : 100 : 100;
                    break;
                case 'D' :
                    sum += 500;
                    break;
                case 'M' :  
                    sum += 1000;
                    break;
            }
        }

        return sum;
    }
}
