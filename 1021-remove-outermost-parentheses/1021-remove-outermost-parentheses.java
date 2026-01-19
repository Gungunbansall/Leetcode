class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                level++;
                if (level > 1) {
                    result.append(ch);
                }
            } 
            else if (ch == ')') {
                if (level > 1) {
                    result.append(ch);
                }
                level--;
            }
        }

        return result.toString();
    }
}
