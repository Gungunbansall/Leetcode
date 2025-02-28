class Solution {
 public:
  vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>>res;
    if(!root)
    return res;
    queue<TreeNode*>q;
    q.push(root);
    while(!q.empty()){
        int n=q.size();
        vector<int>ans;
        while(n--){
            TreeNode* temp = q.front();
            q.pop();
            ans.push_back(temp->val);
            if(temp->left)
            q.push(temp->left);
            if(temp->right)
            q.push(temp->right);

        }
        res.push_back(ans);
    }
        return res;  
          }
  
};
