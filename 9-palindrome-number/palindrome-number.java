class Solution {
    public boolean isPalindrome(int x) {
        int rem ,rev =0;
        int original = x;
        x=Math.abs(x);
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }
}