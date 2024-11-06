package TopInterview150.Array_String.InsertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.List;

class RandomizedSet {

    private List<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        }else{
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove(list.indexOf(val));
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}
