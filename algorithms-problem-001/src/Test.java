import java.util.Arrays;

public class Test {

    public static class TestCase {

        private final int[] numbers;
        private final int target;
        private final int[] expected;

        public TestCase(int[] numbers, int target, int[] expected) {
            this.numbers = numbers;
            this.target = target;
            this.expected = expected;

            Arrays.sort(this.expected);
        }

        public int[] getNumbers() {
            return numbers;
        }

        public int getTarget() {
            return target;
        }

        public int[] getExpected() {
            return expected;
        }

        public boolean isResultValid(int[] result) {
            Arrays.sort(result);
            return Arrays.equals(expected, result);
        }
    }

    public static void main(String[] args) {

        TestCase case1 = new TestCase(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1});
        TestCase case2 = new TestCase(new int[] {3, 2, 4}, 6, new int[] {1, 2});
        TestCase case3 = new TestCase(new int[] {3, 3}, 6, new int[] {0, 1});

        TestCase[] cases = new TestCase[] {case1, case2, case3};

        for (TestCase testCase : cases) {
            boolean isValid = testCase.isResultValid(Solution.twoSum(testCase.getNumbers(), testCase.getTarget()));
            System.out.println(isValid ? "[ OK ] " : "[FAIL] ");
        }

    }

}
