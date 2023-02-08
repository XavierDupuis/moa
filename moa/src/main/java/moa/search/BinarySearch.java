package moa.search;

import java.util.Arrays;

public class BinarySearch {
    public int Search(int[] array, int target) {
        if (array.length == 0) return -1;

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        int min = 0, max = array.length - 1;

        while (max > min) {
            int mid = (max + min) / 2;
            if (sortedArray[mid] == target) {
                return mid;
            }
            if (sortedArray[mid] < target) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return -1;
    }

}

