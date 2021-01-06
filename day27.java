

    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int[] a = new int[0];
            return a;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            int[] a = {1,5,7,3,9};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            int[] a = {5,7,2,6,9,2};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
            return 2;
        }
    }
