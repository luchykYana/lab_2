package lab_2.Products.Fruits;

import lab_2.Enums.BloomFruits;
import lab_2.Enums.Colors;
import lab_2.Enums.FruitFamily;
import lab_2.Enums.RipeningSeason;
import lab_2.Products.Fruit;

public class BloomFruit extends Fruit {
    private BloomFruits fruit;

    public BloomFruit(double price, RipeningSeason maturation, Colors color, String name, FruitFamily family,
                      BloomFruits fruit) {
        super(price, maturation, color, name, family);
        this.fruit = fruit;
    }
}
