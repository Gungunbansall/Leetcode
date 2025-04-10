class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        sort(boxTypes.begin(),boxTypes.end(),[](const vector<int>& a,const vector<int>& b){
            return a[1] > b[1];
        });
        int mx = 0;
        for(auto i:boxTypes)
        {

             if (truckSize == 0) break;  

           
            int boxesToTake = min(i[0], truckSize);  
            mx += boxesToTake * i[1];  
            truckSize -= boxesToTake;  
        }
        return mx;
    }
};