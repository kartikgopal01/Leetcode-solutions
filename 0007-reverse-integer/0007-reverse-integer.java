class Solution {
    public int reverse(int x) {
        int num=0;
        while(x!=0){
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && x%10>7)) return 0;
            if(num<Integer.MIN_VALUE/10 || (num==Integer.MIN_VALUE/10 && x%10<-8)) return 0;

            int n=x%10;
            num=num*10+n;
            x/=10;
        }
        return num;
    }
}