package TopInterview150.Array_String.TextJustification;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        String temp = "";
        int i = 0;
        while(i < words.length){
            if(temp.length() + words[i].length() > maxWidth){
                result.add(fill(temp.trim(), maxWidth));
                temp = "";
            }
            temp += words[i] + " ";
            if(i == words.length - 1){
                temp = temp.trim();
                while(temp.length() < maxWidth){
                    temp += " ";
                }
                result.add(temp);
            }
            i++;
        }
        return result;
    }

    public String fill(String temp, int maxWidth){
        String result = "";
        String[] part = temp.split(" ");
        int space = maxWidth - temp.length() + part.length - 1;
        int amount = 0;
        int index = 0;
        while(amount < space){
            index = index >= part.length - 1 ? 0 : index;
            part[index] += " ";
            amount++;
            index++;
        }
        for(String s : part){
            result += s;
        }
        return result;
    }
}
