package lab_2.Products.Fruits;

import lab_2.Enums.CitrusFruits;
import lab_2.Enums.Colors;
import lab_2.Enums.FruitFamily;
import lab_2.Enums.RipeningSeason;
import lab_2.Products.Fruit;

public class CitrusFruit extends Fruit {
    private CitrusFruits fruit;

    public CitrusFruit(double price, RipeningSeason maturation, Colors color, String name, FruitFamily family,
                       CitrusFruits fruit) {
        super(price, maturation, color, name, family);
        this.fruit = fruit;
    }
}
