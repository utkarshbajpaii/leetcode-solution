class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] first = sentence1.split(" ");
        String[] second = sentence2.split(" ");
        int n = first.length;
        int m = second.length;
        
        if (n > m) {
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                boolean progress = false;  
                if (first[left].equals(second[left])) {
                    left++;
                    progress = true;
                }
                if (first[n - (m - right)].equals(second[right])) {
                    right--;
                    progress = true;
                }
                if (!progress) {
                    return false;
                }
            }
        } else {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                boolean progress = false;  
                if (second[left].equals(first[left])) {
                    left++;
                    progress = true;
                }
                if (second[m - (n - right)].equals(first[right])) {
                    right--;
                    progress = true;
                }
                if (!progress) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
