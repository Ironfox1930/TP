import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Reverse Polish Notation tokens separated by space:");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        Solution solution = new Solution();
        int result = solution.evalRPN(tokens);
        System.out.println("Result: " + result);
    }
}

