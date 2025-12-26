class Solution {
    public boolean isPalindrome(int x) {
        int revNum =0;
        int dup = x;
        while(x>0){
            int last= x%10;
            revNum = revNum*10+last;
            x = x/10;
        }
        return revNum == dup;
        
    }
}