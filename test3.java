package test;

public class test3 {

	public static void main(String[] args) {
	
	}
	class Solution {
	    public String convert(String s, int numRows) {
	        if(numRows == 1) {
	            return s;
	        }
	        
	        int space1 = (numRows-1)*2;
	        int length = s.length();
	        String ret = "";
	        // 첫번째
	        for (int i =0;i<length;i+=space1) {
	            ret+=s.charAt(i);
	        }
	        int space2 = space1;
	        int space3 = 0;
	        
	        for (int j=1;j<numRows-1;j++) {
	            space2 = 2;
	            space3+=2;
	            boolean toggle = true;
	            for ( int i=j;i<length;) {
	                ret+=s.charAt(i);
	                if(toggle) {
	                    i+=space2;
	                } else {
	                    i+=space3;
	                }
	                toggle=!toggle;
	            }
	        }
	        
	        // 마지막 
	        for(int i = numRows-1;i<length;i+=space1) {
	            ret+=s.charAt(i);
	        }
	        return ret;
	    }
	}
}
