package BinarySearch.Iterative;


public class BinarySearchIterative {
    private int[] arr;

    public BinarySearchIterative(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] sortArr = {30, 40, 50, 60, 65, 70, 75, 80};
        int searchElem = 50;
        BinarySearchIterative obj = new BinarySearchIterative(sortArr);
        obj.binarySearch(searchElem);
    }

    public void binarySearch(int searchElem) {
        int low = 0;
        int high = arr.length - 1;
        int position = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (searchElem == arr[mid]) {
                System.out.print("Index of element searched is " + mid);
                position += 1;
                break;
            } else if (searchElem < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (position == 0)
            System.out.print("Null");
    }
}

