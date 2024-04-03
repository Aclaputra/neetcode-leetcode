package valid_anagram.solution.bubble_sort;

public class BubbleSort {
    public static void bubbleSort(char arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        bubbleSort(sArray);
        bubbleSort(tArray);

        return new String(sArray).equals(new String(tArray));
    }
    public static void main(String[] args) {
        
    }    
}
