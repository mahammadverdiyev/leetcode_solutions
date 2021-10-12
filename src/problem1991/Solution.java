package problem1991;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] leftPrefix = new int[nums.length];
        int[] rightPrefix =  new int[nums.length];

        int leftSum = 0;
        int rightSum = 0;


        for(int i = 1, j = nums.length - 2; i < nums.length; i++, j--){
            leftSum += nums[i - 1];
            rightSum += nums[j + 1];

            leftPrefix[i] = leftSum;
            rightPrefix[j] = rightSum;
        }

        for(int i = 0; i < nums.length; i++){
            if(leftPrefix[i] == rightPrefix[i]){
                return i;
            }
        }

        return -1;
    }
}
