package lab_2;

import lab_2.Enums.Colors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortManager {

    // inner class
    class ComparatorInnerClass implements Comparator<Product> {
        @Override
        public int compare(Product i1, Product i2) {
            return i1.getColor().compareTo(i2.getColor());
        }
    }

    // inner class
    public List<Product> sortUpByColor(List<Product> list) {
        var res = new ArrayList<>(list);

        res.sort(new ComparatorInnerClass());

        return res;
    }

    //    inner static class
    static class ComparatorStaticInnerClass implements Comparator<Product>{
        @Override
        public int compare(Product i1, Product i2) {
            return i2.getColor().compareTo(i1.getColor());
        }
    }

    public static List<Product> sortDownByColor(List<Product> list) {
        var res = new ArrayList<>(list);

        res.sort(new SortManager.ComparatorStaticInnerClass());

        return res;
    }

    // анонімний клас
    public List<Product> sortUpByPrice(List<Product> list) {
        var res = new ArrayList<>(list);

        res.sort(new Comparator<Product>() {
            public int compare(Product i1, Product i2) {
                return (int)(i1.getPrice() - i2.getPrice());
            }
        } );

        return res;
    }

    // лямбда-вираз
    public List<Product> sortDownByPrice(List<Product> list) {
        var res = new ArrayList<>(list);

        res.sort((Product i1, Product i2) -> (int)(i2.getPrice() - i1.getPrice()));

        return res;
    }
}
