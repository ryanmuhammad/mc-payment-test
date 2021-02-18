package id.mcpayment.test;

import java.util.Arrays;

public class Solution {

    public int[] numberOne(int[] nums) {
        return new int[]{Arrays.stream(nums).reduce(0, Integer::max)};
    }

    public int[] numberTwo(int[] nums, int x) {
        return Arrays.stream(nums).filter(i -> i != x).toArray();
    }

    public String[] numberThree(String word, int len) {
        return Arrays.stream(word.split(" ")).filter(s -> s.length() == len).toArray(String[]::new);
    }
}
