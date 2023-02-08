package moa.search;

import weka.core.pmml.jaxbbindings.False;

import java.util.Arrays;

public class BinarySearch {
    public boolean Search(int[] array, int target) {
        if (array.length == 0) return false;

        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        int min = 0, max = array.length - 1;

        while (max > min) {
            int mid = (max + min) / 2;
            if (sortedArray[mid] == target) {
                return true;
            }
            if (sortedArray[mid] < target) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return false;
    }

}

