package lab_2.Products;

import lab_2.Enums.Colors;
import lab_2.Enums.FruitFamily;
import lab_2.Enums.RipeningSeason;
import lab_2.Enums.TypeProduct;
import lab_2.IType;
import lab_2.Product;

public class Fruit extends Product implements IType {
    protected FruitFamily family;
    private final TypeProduct type = TypeProduct.FRUIT;
    public Fruit(double price, RipeningSeason maturation, Colors color, String name, FruitFamily family) {
        super(price, maturation, color, name);
        this.family = family;
    }

    @Override
    public String toString() {
        return super.toString() + "\tFruit\t{ " +
                "\tfamily=" + family +
                ",\ttype=" + type +
                " }";
    }

    @Override
    public TypeProduct getType() {
        return type;
    }
}
