class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);

        int[] freq = new int[arr.length];
        int k = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                freq[k++] = count;
                count = 1;
            }
        }

        freq[k++] = count;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (freq[i] == freq[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}