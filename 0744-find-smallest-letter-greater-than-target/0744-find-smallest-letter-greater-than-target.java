class Solution {
    int binarySearch(char[] letters, char target, int start, int end) {
        int mid = (start + end) / 2;

        if (letters[mid] == target)
            return mid + 1;
        if (start >= end)
            return mid;
        if (letters[mid] > target)
            return binarySearch(letters, target, start, mid - 1); 
        
        return binarySearch(letters, target, mid + 1 , end);//if (letters[mid] < 0)
    }
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[0] > target)
          return letters[0];
        else if(target >= letters[letters.length - 1])
            return letters[0];  

        int firstOccurrence = binarySearch(letters, target, 0, letters.length - 1);
        while (firstOccurrence < letters.length - 1 && letters[firstOccurrence] <= target)
            ++firstOccurrence;

        return letters[firstOccurrence];
    }
}