class Solution {

    public int removeDuplicates(int[] arr) {

        if(arr.length == 0) {
            return 0;
        }

        int uniquePointer = 1;

        for(int scan = 1; scan < arr.length; scan++) {

            if(arr[scan] != arr[scan - 1]) {

                arr[uniquePointer] = arr[scan];
                uniquePointer++;
            }
        }

        return uniquePointer;
    }
}
