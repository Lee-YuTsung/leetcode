package TopInterview150.Array_String.GasStation;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int startEnd = -1;

        for(int i = 0; i <gas.length; i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(costSum <= gasSum){
            for(int i = 0; i < gas.length; i++){
                if(gas[i] > 0 && gas[i] >= cost[i]){
                    int tank = 0;
                    for(int j = 0; j < gas.length; j++){
                        tank += i + j >= gas.length ? gas[i + j - gas.length] - cost[i + j - cost.length] : gas[i + j] - cost[i + j];
                        if(tank < 0){
                            break;
                        }else if(tank >= 0 && j == gas.length - 1){
                            startEnd = i;
                        }
                    }
                }
                if(startEnd != -1){
                    break;
                }
            }
        }

        return startEnd;
    }
}