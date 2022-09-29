package test;

class Solution {
    static int[][] dpvalue;
    
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x); //형변환.
        int length = str.length(); ///길이구하는거
        
        dpvalue = new int[length][length];
        
        int ret= calc(str,0,length-1); //처음부터 끝까지 palindrome을 찾는거, 
        
        if(ret ==1) {
            return true;
        } else {
            return false;
        }
    }
    public static int calc(String s, int start, int end){
        if (start >=end) {
            return 1;
        }
        if (dpvalue[start][end] !=0 ){
            return dpvalue[start][end];
        }
        int ret = -1;
        
        if(s.charAt(start) == s.charAt(end)) {
            ret = calc(s,start+1, end-1);
        }
        dpvalue[start][end] = ret;
        return ret;
    }
}
public class LeetCode_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
