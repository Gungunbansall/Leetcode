class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        for(int i=0;i<accounts.length;i++)
        {
            int Sum=0;
            for(int j = 0; j<accounts[i].length;j++)
            {
                Sum += accounts[i][j];
            }
            
            if(Sum >max){
                max = Sum;
            }
        }
        return max;
    }

}