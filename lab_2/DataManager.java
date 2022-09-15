package lab_2;

import lab_2.Enums.*;
import lab_2.Products.Berry;
import lab_2.Products.Fruits.BloomFruit;
import lab_2.Products.Fruits.CitrusFruit;
import lab_2.Products.Fruits.StoneFruit;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    public static List<Product> getMockData() {
        List<Product> res = new ArrayList<Product>();

        res.add(new Berry(79.99, RipeningSeason.SUMMER, Colors.PINK, "Raspberry", true));
        res.add(new Berry(99.00, RipeningSeason.SUMMER, Colors.RED, "Strawberry", false));
        res.add(new Berry(102.00, RipeningSeason.WINTER, Colors.BLACK, "Lokhina", true));
        res.add(new BloomFruit(20.30, RipeningSeason.FALL, Colors.YELLOW, "Golden", FruitFamily.BLOOM_FRUIT,
                BloomFruits.APPLE ));
        res.add(new BloomFruit(21.99, RipeningSeason.FALL, Colors.RED, "Gala", FruitFamily.BLOOM_FRUIT,
                BloomFruits.APPLE ));
        res.add(new BloomFruit(52.85, RipeningSeason.FALL, Colors.RED, "Duchies", FruitFamily.BLOOM_FRUIT,
                BloomFruits.PEAR ));
        res.add(new CitrusFruit(150.00, RipeningSeason.WINTER, Colors.ORANGE, "Clementine",
                FruitFamily.CITRUS_FRUIT, CitrusFruits.TANGERINE ));
        res.add(new CitrusFruit(94.50, RipeningSeason.WINTER, Colors.ORANGE, "Orange",
                FruitFamily.CITRUS_FRUIT, CitrusFruits.ORANGE ));
        res.add(new CitrusFruit(194.50, RipeningSeason.SUMMER, Colors.GREEN, "Lime",
                FruitFamily.CITRUS_FRUIT, CitrusFruits.LIME ));
        res.add(new StoneFruit(193.00, RipeningSeason.SPRING, Colors.YELLOW, "Apricot",
                FruitFamily.STONE_FRUIT, StoneFruits.APRICOT ));
        res.add(new StoneFruit(15.00, RipeningSeason.SUMMER, Colors.RED, "Cherry", FruitFamily.STONE_FRUIT,
                StoneFruits.CHERRY ));

        return res;
    }
}
