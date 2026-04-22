class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd = new int[n];
        int[] rightProd = new int[n];

        leftProd[0] = rightProd[n - 1] = 1;
        leftProd[1] = nums[0];
        rightProd[n - 2] = nums[n - 1];

        for(int i = 2; i < n; i++){
            leftProd[i] = nums[i - 1] * leftProd[i - 1];
        }

        for(int i = n - 3; i >= 0; i--){
            rightProd[i] = nums[i + 1] * rightProd[i + 1];
        }

        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = leftProd[i] * rightProd[i];
        }

        return res;
    }
}  
