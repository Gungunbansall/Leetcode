class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l =0;
        int r =k-1;
        int sum =0;
        for(int i = l;i<=r;i++){
            sum+=nums[i];
        }
        int max_sum = sum;

        while(r<n-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            max_sum= Math.max(max_sum,sum);
        }
        return (double)max_sum/k;
        
    }
}