class Solution {
    public int[] twoSum(int[] numbers, int targett) {
         int left = 0 ; 
          int right = numbers.length-1;
          while(left<right){
          int sum = numbers[left] + numbers[right];
        if(sum==targett){
            return new int[]{left+1 ,right+1};
        }

            
        else if(sum<targett){
            left++;
        }
        else{
            right--;
        }


          } 
          return new int[]{};
    }
}
