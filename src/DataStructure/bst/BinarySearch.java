package DataStructure.bst;

public class BinarySearch {

    public int binarySearch_iteration(int[] array, int element, int low, int high){
        while (low<=high){
            int mid = low + (high-low)/2;

            if(array[mid] == element)
                return mid;

            if(array[mid] < element){
                low = mid +1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }

    public int binarySearch_recursive(int[] array, int n, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(array[mid] == n){
                return mid;
            }

            if(array[mid]>n){
                return binarySearch_iteration(array, n, low, mid-1);
            }
            else {
                return binarySearch_iteration(array, n, mid+1, high);
            }
        }
        return -1;
    }
}



/*
3, 4, 5, 6, 7, 8, 9
Binary search is a fast search algorithm with run-time complexity of Ο(log n). This search algorithm works on the principle of divide and conquer.
For this algorithm to work properly, the data collection should be in the sorted form.

Binary search looks for a particular item by comparing the middle most item of the collection.
If a match occurs, then the index of item is returned. If the middle item is greater than the item,
 then the item is searched in the sub-array to the left of the middle item. Otherwise,
 the item is searched for in the sub-array to the right of the middle item.
 This process continues on the sub-array as well until the size of the subarray reduces to zero.
 */
