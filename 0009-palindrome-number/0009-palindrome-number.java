class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int n=x%10;
            num=num*10+n;
            x/=10;
        }
        if(num==temp)return true;

        return false;
    }
}