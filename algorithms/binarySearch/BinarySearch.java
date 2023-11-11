package algorithms.binarySearch;

public class BinarySearch {

    /*
     * Time Complexity
     * Average : O (log N)
     */

    public static int integerSearchAsc(int[] list, int target) {

        if (list.length < 1) {

            return -1;
        }

        int start = 0;
        int end = list.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (list[mid] == target) {

                return mid;
            }

            if (target > list[mid]) {

                start = mid + 1;
            }

            if (target < list[mid]) {

                end = mid - 1;
            }
        }

        return -1;
    }

    public static int integerSearchDesc(int[] list, int target) {

        if (list.length < 1) {

            return -1;
        }

        int start = 0;
        int end = list.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (list[mid] == target) {

                return mid;
            }

            if (target > list[mid]) {

                end = mid - 1;
            }

            if (target < list[mid]) {

                start = mid + 1;
            }
        }

        return -1;
    }

    public static int ceilSearch(int[] list, int target) {

        /*
         * return index of the element
         * smallest element => equal or greater then target
         */

        if (list.length < 1) {

            return -1;
        }

        int start = 0;
        int end = list.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (list[mid] == target) {

                return mid;
            }

            if (target > list[mid]) {

                start = mid + 1;
            }

            if (target < list[mid]) {

                end = mid - 1;
            }
        }

        return start;
    }

    public static int floorSearch(int[] list, int target) {

        /*
         * return index of the element
         * greatest element => equal or smaller then target
         */

        if (list.length < 1) {

            return -1;
        }

        int start = 0;
        int end = list.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (list[mid] == target) {

                return mid;
            }

            if (target > list[mid]) {

                start = mid + 1;
            }

            if (target < list[mid]) {

                end = mid - 1;
            }
        }

        return end;
    }
}