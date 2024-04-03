package valid_anagram.solution.quick_sort;

import java.util.Arrays;

public class QuickSort {
    public static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(char arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i + 1);
    }

    public static char[] quickSort(char arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            arr = quickSort(arr, low, pi-1);
            arr = quickSort(arr, pi+1, high);
        }
        return arr;
    }

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
