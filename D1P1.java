/*Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        int[] rot=new int[nums.length];
        int j=0;
        for(int i=k;i<nums.length;i++,j++){
            rot[i]=nums[j];
        }
        for(int i=0;i<k;i++,j++){
            rot[i]=nums[j];
        }
        System.arraycopy(rot,0,nums,0,nums.length);
    }
}
