// Problem: Valid Parentheses
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/valid-parentheses/
// Solved on: 2026-10-05T05:16:48.666Z

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i); // Fix: Use charAt() instead of []
            
            // If it's an opening bracket, push to stack
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there is no matching opening bracket
                if (st.isEmpty()) { 
                    return false;
                }
                
                char top = st.peek(); // Fix: Use peek() instead of top()
                
                // Check if the top of the stack matches the closing bracket
                if ((top == '(' && current == ')') || 
                    (top == '{' && current == '}') || 
                    (top == '[' && current == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were properly matched
        return st.isEmpty();
    }
}
