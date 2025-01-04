public class Solution {
    private int index;

    public int evalRPN(String[] tokens) {
        index = tokens.length; // Initialize index to the length of tokens
        return evalRPN_1(tokens);
    }

    private int evalRPN_1(String[] tokens) {
        index -= 1; // Move backward in the tokens array
        String token = tokens[index];

        switch (token) {
            case "+":
                return evalRPN_1(tokens) + evalRPN_1(tokens);
            case "-":
                int subtractY = evalRPN_1(tokens);
                int subtractX = evalRPN_1(tokens);
                return subtractX - subtractY;
            case "/":
                int divideY = evalRPN_1(tokens);
                int divideX = evalRPN_1(tokens);
                return divideX / divideY;
            case "*":
                return evalRPN_1(tokens) * evalRPN_1(tokens);
            default:
                return Integer.parseInt(token); // Parse integers
        }
    }
}


