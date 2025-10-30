package Array_list_in_hamming_algorithm;
//import java.util.ArrayList;
//public class Arraylist {
//        public static void main(String[] args) {
//            ArrayList<String> cars = new ArrayList<String>();
//            cars.add("Volvo");
//            cars.add("BMW");
//            cars.add("Ford");
//            cars.add("Mazda");
//            System.out.println(cars);
//        }
//    }


    import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);
    }
}
