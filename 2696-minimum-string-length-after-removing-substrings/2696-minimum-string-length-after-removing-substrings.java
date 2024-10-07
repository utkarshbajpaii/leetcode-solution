class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s); // Start with the input string

        for (int i = 0; i < sb.length() - 1; ) {
            String pair = sb.substring(i, i + 2);
            if (pair.equals("AB") || pair.equals("CD")) {
                sb.delete(i, i + 2); 
                if (i > 0) i--;
            } else {
                i++; 
            }
        }

        return sb.length();
    }
}
