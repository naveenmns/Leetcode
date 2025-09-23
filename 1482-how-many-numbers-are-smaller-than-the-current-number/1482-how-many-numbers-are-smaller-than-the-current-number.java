class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[] sortAry = Arrays.copyOf(nums, n);
        Arrays.sort(sortAry);
        Map<Integer, Integer> valVsCount = new HashMap<>();
        for(int i=0 ; i<n ; i++)
        {
            valVsCount.putIfAbsent(sortAry[i], i);
        }
        int[] result = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            result[i] = valVsCount.get(nums[i]);
        }
        return result;
    }
}