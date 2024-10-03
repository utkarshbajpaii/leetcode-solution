class Solution {
    public int minSubarray(int[] nums, int p) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int rem = (int)(sum % p);
        if (rem == 0) {
            return 0;
        }
        
        long preFix = 0; 
        int min = n;
        map.put(0, -1); 
        for (int i = 0; i < n; i++) {
            preFix += nums[i];
            int currentMod = (int)(preFix % p);
            int modWeWant = (currentMod - rem + p) % p; 
            if (map.containsKey(modWeWant)) {
                min = Math.min(min, i - map.get(modWeWant));
            }
            map.put(currentMod, i);
        }
        return min == n ? -1 : min;
    }
}
