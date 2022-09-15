package lab_2;

import java.util.List;

public class DisplayManager {
    public static void display(List<Product> list) {
        for (Product elem : list) {
            System.out.println(elem);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
