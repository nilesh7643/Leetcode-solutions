class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List <Integer> result = new ArrayList<> ();
      int left = 0;
        int right = 0;

        for (int num : nums) {
            if (num < target) {
                left++;
            } else if (num == target) {
                right++;
            }
        }

        for (int i = left; i < left + right; i++) {
            result.add(i);
        }

        return result;
    }
}