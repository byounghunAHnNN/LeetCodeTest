package test;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] used = new boolean[128];
        int maxCount =0;
        int count =0;
        
        int length = s.length();
        
        if(length ==1) {
            return 1;
        }
        for (int i=0;i<length;i++) {
            for(int j=i;j<length; j++) {
                char ch = s.charAt(j);
                if(!used[ch]){
                    used[ch] = true;
                    count++;
                } else {
                    break;
                }
            }
            
            maxCount = Math.max(maxCount,count);
            count=0;
            used = new boolean[128];
        }
        
        return maxCount;
    }
} 