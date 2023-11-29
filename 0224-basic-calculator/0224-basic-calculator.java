class Solution {
    public int calculate(String s) {
        int sign = 1; // 1 or -1
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            //number
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                // 9 or xxx-999 sum = sum + (-1) * 999 ==> sum = sum - 999
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num*10 + s.charAt(i) - '0';
                    i++;
                }
                sum += num*sign;
                i--;
                
            } else if (s.charAt(i) == '+') {
                
                sign = 1;
                
            } else if (s.charAt(i) == '-') {
                
                sign = -1;
                
            } else if (s.charAt(i) == '(') {
                
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
                
            } else if (s.charAt(i) == ')') {
                
                sum = stack.pop() * sum;
                sum += stack.pop();
                
            }
        }
        return sum;
    }
}