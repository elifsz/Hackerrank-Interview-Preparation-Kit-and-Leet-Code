class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(num.containsKey(nums[i])){
                num.remove(nums[i]);
            }else{
                num.put(nums[i],1);
            }
        }
        return num.keySet().stream().findFirst().get();
    }
}
