class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        // Pointers to the last characters of each string
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Carry from previous addition
        int carry = 0;

        // Continue until both strings are processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {

            // Get current digit from num1, or 0 if exhausted
            int x = (i >= 0) ? num1.charAt(i--) - '0' : 0;

            // Get current digit from num2, or 0 if exhausted
            int y = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            // Add digits and carry
            int sum = x + y + carry;

            // Update carry
            carry = sum / 10;

            // Append current digit
            sb.append(sum % 10);
        }

        // Reverse because digits were added from least significant to most significant
        return sb.reverse().toString();
    }
}
