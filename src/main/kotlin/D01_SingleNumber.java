import java.util.Arrays;

class D01_SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 && nums[i] != nums[i + 1]) {
                return nums[i];
            }
            if (i == nums.length - 2 && nums[i] != nums[i + 1]) {
                return nums[i + 1];
            }
            if (i > 0 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        throw new RuntimeException("No single digit found");
    }

    public static void main(String[] args) {
        System.out.println(new D01_SingleNumber().singleNumber(new int[]{3, 3, 4, 5, 7, 7, 4}));
    }
}
