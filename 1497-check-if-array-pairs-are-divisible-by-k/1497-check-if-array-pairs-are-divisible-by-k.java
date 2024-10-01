class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainder = new int[k]; 
        for (int num : arr) {
            int rem = num % k;
            if (rem < 0) {
                rem += k; 
            }
            remainder[rem]++;
        }

        for (int i = 1; i < k; i++) {
            if (remainder[i] != remainder[k - i]) {
                return false;
            }
        }
        return remainder[0] % 2 == 0;
    }
}



