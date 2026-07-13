class Solution {
    public int maxDepth(String s) {
        int n =s.length();
        char[] ch  = s.toCharArray();
        int count=0;
        int b=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
       
            if(ch[i]=='('){
                count+=1;
            }
            if(ch[i]==')'){
                count-=1;
            }
            b=Math.max(b,count);
        }
  return b;
    }
}