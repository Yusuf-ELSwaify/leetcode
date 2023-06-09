class Solution {
    char target;
    int binarySearch(char[] letters, int start, int end) {
        int mid = (start + end) / 2;

        if (start > end)
            return start;
        
        if (letters[mid] > target)
            return binarySearch(letters, start, mid - 1); 
        
        return binarySearch(letters, mid + 1 , end);//if (letters[mid] <= target)
    }
    public char nextGreatestLetter(char[] letters, char target) {
        this.target = target;
        int resultIndex = binarySearch(letters, 0, letters.length - 1);
        resultIndex = resultIndex == letters.length ? 0 : resultIndex;
 
        return letters[resultIndex];
    }
}