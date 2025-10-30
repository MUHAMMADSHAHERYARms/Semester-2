package basics;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

    public class Month_Employee_Wise_Sale {
        public static void main(String[] args) {
            try {
                // ✅ Step 1: File ka path likho (apni file ka address)
                File file = new File("C:\\\\Users\\\\NEW\\\\Desktop\\\\second sem\\\\sampleForQuizExam.txt");

                // ✅ Step 2: Scanner se file ko read karo
                Scanner sc = new Scanner(file);

                // ✅ Step 3: HashMap banao (key = month + rep, value = total sale)
                HashMap<String, Integer> sales = new HashMap<>();

                // ✅ Step 4: Pehli line skip kar do (header hoti hai)
                sc.nextLine();

                // ✅ Step 5: Har line read karo
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    if (line.isEmpty()) continue; // agar line khali hai to skip karo

                    // ✅ Step 6: Tab se split karo
                    String[] arr = line.split("\t");

                    // ✅ Step 7: Month aur Rep nikal lo
                    String date = arr[4];
                    String month = date.split("/")[0];  // e.g. "6/17/2019" → "6"
                    String rep = arr[5];                // e.g. "E011"

                    // ✅ Step 8: Price aur Quantity lo
                    int price = Integer.parseInt(arr[2]);
                    int qty = Integer.parseInt(arr[3]);
                    int total = price * qty;

                    // ✅ Step 9: Month aur Rep ko ek saath key banao (example: "6-E011")
                    String key = month + "-" + rep;

                    // ✅ Step 10: Agar key pehli dafa aa rahi hai to 0 rakho
                    if (!sales.containsKey(key)) {
                        sales.put(key, 0);
                    }

                    // ✅ Step 11: Us key me total sale add kar do
                    sales.put(key, sales.get(key) + total);
                }

                // ✅ Step 12: Result print karo
                System.out.println("Month + Employee Wise Sale:");
                for (String key : sales.keySet()) {
                    System.out.println(key + " = " + sales.get(key));
                }

                // ✅ Step 13: Scanner close karo
                sc.close();

            } catch (Exception e) {
                System.out.println("Error aaya: " + e);
            }
        }
    }