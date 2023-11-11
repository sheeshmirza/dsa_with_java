package algorithms.linearSearch;

public class LinearSearch {

    /*
     * Time Complexity
     * Best : O (1)
     * Average : O (N)
     * Worst : O (N)
     */

    public static int integerSearch(int[] list, int target) {

        if (list.length < 1) {

            return -1;
        }

        for (int i = 0; i < list.length; i++) {

            int element = list[i];

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int integerSearch(int[] list, int target, int start) {

        if (list.length < 1) {

            return -1;
        }

        for (int i = start; i < list.length; i++) {

            int element = list[i];

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int integerSearch(int[] list, int target, int start, int end) {

        if (list.length < 1) {

            return -1;
        }

        for (int i = start; (i < list.length && i < end); i++) {

            int element = list[i];

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int min(int[] list) {

        if (list.length == 0) {

            return -1;
        }

        if (list.length == 1) {

            return list[0];
        }

        int min = list[0];

        for (int i = 1; i < list.length; i++) {

            int element = list[i];

            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public static int max(int[] list) {

        if (list.length == 0) {

            return -1;
        }

        if (list.length == 1) {

            return list[0];
        }

        int max = list[0];

        for (int i = 1; i < list.length; i++) {

            int element = list[i];

            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public static int[] integerSearch(int[][] list, int target) {

        if (list.length < 1) {

            return new int[] { -1, -1 };
        }

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list[i].length; j++) {

                int element = list[i][j];

                if (element == target) {

                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    public static int characterSearch(String string, Character target) {

        if (string.length() < 1) {

            return -1;
        }

        for (int i = 0; i < string.length(); i++) {

            Character element = string.charAt(i);

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int characterSearch(String string, Character target, int start) {

        if (string.length() < 1) {

            return -1;
        }

        for (int i = start; i < string.length(); i++) {

            Character element = string.charAt(i);

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int characterSearch(String string, Character target, int start, int end) {

        if (string.length() < 1) {

            return -1;
        }

        for (int i = start; (i < string.length() && i < end); i++) {

            Character element = string.charAt(i);

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int stringSearch(String string, String target) {

        if (string.length() < target.length()) {

            return -1;
        }

        for (int i = 0; i < string.length() - target.length() + 1; i++) {

            String element = string.substring(i, i + target.length());

            if (element == target) {

                return i;
            }
        }

        return -1;
    }

    public static int stringSearch(String string, String target, int start) {

        if (string.length() < target.length()) {

            return -1;
        }

        for (int i = start; i < string.length() - target.length() + 1; i++) {

            String element = string.substring(i, i + target.length());

            if (element == target) {

                return i;
            }
        }

        return -1;
    }
}