class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res; 
        if (!root) 
            return res;
        queue<TreeNode*> q;
        q.push(root);
        int levelCount = 0;
        while (!q.empty()) {
            int n = q.size();
            vector<int> level; 
            for (int i = 0; i < n; ++i) {
                TreeNode* temp = q.front();
                q.pop();
                if (levelCount % 2 == 0) 
                    level.push_back(temp->val);
                else 
                    level.insert(level.begin(), temp->val); 
                if (temp->left)
                    q.push(temp->left);
                
                if (temp->right)
                    q.push(temp->right);
            }
            
            res.push_back(level); 
            levelCount++; 
        }
        
        return res;  
    }
};

