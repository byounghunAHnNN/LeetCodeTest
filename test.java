package study1;

class Solution {
	   public int[] twoSum(int[] nums, int target) {
		   int[] ret = new int[2];
		   int length = nums.length;
		   for(int i=0;i<length-1;i++) {
			   ret[0] = i;
			   for(int j=i+1;j<length;j++) {
				   if(nums[i]+nums[j]==target) {
					   ret[1] = j;
					   return ret;
	                }
	            }
	        }
	        // In case there is no solution, we'll just return null
	        return null;
	    }
	}