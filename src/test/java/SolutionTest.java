import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testEvalRPN() {
        Solution solution = new Solution();

        // Example 1
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        assertEquals(9, solution.evalRPN(tokens1));

        // Example 2
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        assertEquals(6, solution.evalRPN(tokens2));

        // Example 3
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+"};
        assertEquals(22, solution.evalRPN(tokens3));
    }
}

