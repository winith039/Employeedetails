/*Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int last=numbers.length-1;
        while(i<last){
            if((numbers[i]+numbers[last])>target){
                last--;
            }
            else if(numbers[i]+numbers[last]<target){
                i++;
            }
            else{
                return new int[] {i+1,last+1};
            }
        }
        
        return new int[] {i+1,last+1};
    }
}
