class Solution {
    public boolean isPalindrome(String s) {
         if(s== null || s.length() ==0){
                        return true;
                                }
         
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=0;i<s.length()/2;i++){
            int start = s.charAt(i);
            int end = s.charAt(s.length()-1-i);
            if(start!= end){
                return false;
            }
        }
        return true;

    }
    
}