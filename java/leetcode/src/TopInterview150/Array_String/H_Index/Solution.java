package TopInterview150.Array_String.H_Index;

class Solution {
    public int hIndex(int[] citations) {
        return target(citations.length, citations);
    }

    public static int target(int index, int[] citations){
        int count = 0;
        for(int i = 0; i < citations.length;i++){
            count = citations[i] >= index ? count + 1 : count;
            if(count == index){
                break;
            }
        }
        
        return count == index ? count : index > 0 ? target(index - 1, citations) : 0;
    }
}