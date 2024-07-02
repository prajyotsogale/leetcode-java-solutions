class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse = 0;
        int rough = x;
        while(rough!=0){
            reverse = reverse*10 + rough%10;
            rough /=10;
        }
        if(x==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}
