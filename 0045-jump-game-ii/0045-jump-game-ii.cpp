class Solution {
public:
    int jump(vector<int>& nums) {
        int len = nums.size();
        int numJumps = 0;           
        int currentMaxReach = 0;   
        int lastMaxReach = 0;       
        for (int i = 0; i < len - 1; ++i) {
            currentMaxReach = max(currentMaxReach, i + nums[i]);
            if (lastMaxReach == i) {
                numJumps++;
                lastMaxReach = currentMaxReach;  
            }
        }
        return numJumps;
    }
};