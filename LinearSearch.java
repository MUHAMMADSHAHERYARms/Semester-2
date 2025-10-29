public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        int t = 30;  

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in array.");
        }
    }
}
