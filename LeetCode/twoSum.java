    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (numbers.containsKey(sum)) {
                int[] returns = {i, numbers.get(sum)};
                return returns;
            }
            numbers.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
