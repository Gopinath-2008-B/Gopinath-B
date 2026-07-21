class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder is used to efficiently build the merged string
        StringBuilder sb = new StringBuilder();

        // Pointers for both strings
        int i = 0, j = 0;

        // Continue until both strings are completely processed
        while (i < word1.length() || j < word2.length()) {

            // Add one character from word1 if available
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
                i++;
            }

            // Add one character from word2 if available
            if (j < word2.length()) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        // Convert StringBuilder to String and return
        return sb.toString();
    }
}
