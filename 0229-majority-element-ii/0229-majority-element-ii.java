class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int n= nums.length;
       
        for(int i=0;i<nums.length;i++){
            int value=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
            
        }
        for(int num :mpp.keySet()){
            if(mpp.get(num)>nums.length/3){
                ans.add(num);
            }
        }
        return ans;
        
    }
}