package valid_anagram.solution.sorting_package;

import java.util.Arrays;

class SortingPackage {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return new String(sArray).equals(new String(tArray));
    }
    public static void main(String[] args) {
        
    }
}