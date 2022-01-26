class Solution {
    public int climbStairs(int n) {
        //using dp
        int goal = 1;
        int beforeGoal = 1;
        
        //starting last and shifting left
        for(int i=0; i<=n-2; i++){
            int temp = goal;
            goal = goal + beforeGoal;
            beforeGoal = temp;
        }
        
        return goal;
    }
}
