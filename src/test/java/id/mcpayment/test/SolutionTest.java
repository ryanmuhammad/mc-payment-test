package id.mcpayment.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Nested
    @DisplayName("Solution number 1")
    class solutionNumberOne {

        @Test
        @DisplayName("Should return array of 0 when parameter is empty")
        public void test1() {
            int[] actualResult =  solution.numberOne(new int[]{});
            assertThat(actualResult, equalTo(new int[]{0}));
        }

        @Test
        @DisplayName("Should return array of 4")
        public void test2() {
            int[] actualResult =  solution.numberOne(new int[]{3,1,4,2});
            assertThat(actualResult, equalTo(new int[]{4}));
        }

        @Test
        @DisplayName("Should return array of 10")
        public void test3() {
            int[] actualResult =  solution.numberOne(new int[]{3,1,4,2,5,6,7,8,10});
            assertThat(actualResult, equalTo(new int[]{10}));
        }
    }


    @Nested
    @DisplayName("Solution number 2")
    class solutionNumberTwo {

        @Test
        @DisplayName("Should return empty array")
        public void test1() {
            int[] actualResult =  solution.numberTwo(new int[]{}, 4);
            assertThat(actualResult, equalTo(new int[]{}));
        }

        @Test
        @DisplayName("Should return array of {1,2,3}")
        public void test2() {
            int[] actualResult =  solution.numberTwo(new int[]{1,2,3,4}, 4);
            assertThat(actualResult, equalTo(new int[]{1,2,3}));
        }

        @Test
        @DisplayName("Should return array of {1,2,3,4}")
        public void test3() {
            int[] actualResult =  solution.numberTwo(new int[]{1,2,3,4}, 5);
            assertThat(actualResult, equalTo(new int[]{1,2,3,4}));
        }

        @Test
        @DisplayName("Should return array of {1,2,3,4,5,6,7,8,9}")
        public void test4() {
            int[] actualResult =  solution.numberTwo(new int[]{1,2,3,4,5,6,7,8,9,10}, 10);
            assertThat(actualResult, equalTo(new int[]{1,2,3,4,5,6,7,8,9}));
        }
    }

    @Nested
    @DisplayName("Solution number 3")
    class solutionNumberThree {

        @Test
        @DisplayName("Should return empty array")
        public void test1() {
            String[] actualResult =solution.numberThree("souvenir loud four lost", 10);
            assertThat(actualResult, equalTo(new String[]{}));
        }

        @Test
        @DisplayName("Should return array of {\"loud\", \"four\", \"lost\"}")
        public void test2() {
            String[] actualResult =solution.numberThree("souvenir loud four lost", 4);
            assertThat(actualResult, equalTo(new String[]{"loud", "four", "lost"}));
        }

        @Test
        @DisplayName("Should return array of {\"souvenir\"}")
        public void test3() {
            String[] actualResult =solution.numberThree("souvenir loud four lost yeah", 8);
            assertThat(actualResult, equalTo(new String[]{"souvenir"}));
        }
    }
}
