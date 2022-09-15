package lab_2;

import lab_2.Enums.RipeningSeason;
import lab_2.Products.Berry;
import lab_2.Products.Fruits.CitrusFruit;

import java.util.ArrayList;
import java.util.List;

public class SearchManager {
    public static List<Product> searchForSeason(List<Product> list) {
        List<Product> res = new ArrayList<Product>();

        for (Product elem : list) {
            if(elem.getMaturation().equals(RipeningSeason.SUMMER) &&
                    (elem instanceof Berry || elem instanceof CitrusFruit) ) {
                res.add(elem);
            }
        }

        return res;
    }
}
