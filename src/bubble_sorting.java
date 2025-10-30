public class bubble_sorting {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) { // inner loop
                if (arr[j] > arr[j + 1]) { // swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array after all passes
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}


//
//        public static void main(String[] args) {
//            int [] arr = { 1,3,2,5,4};
//            for (int i=0 ; i<arr.length-1 ; i++)
//            {
//                for ( int j=0 ; j<arr.length-1-i ; j++) {
//                    if (arr[j] > arr[j + 1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }
//            System.out.print("Sorted Numbers are : ");
//            for (int a : arr)
//            {
//                System.out.print(a+ " " ) ;
//            }
//
//        }
//    }