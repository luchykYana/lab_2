package lab_2.Products;

import lab_2.Enums.Colors;
import lab_2.Enums.RipeningSeason;
import lab_2.Enums.TypeProduct;
import lab_2.IType;
import lab_2.Product;

public class Berry extends Product implements IType {
    protected boolean isForestBerry;
    protected final TypeProduct type = TypeProduct.BERRY;

    public Berry(double price, RipeningSeason maturation, Colors color, String name, boolean isForestBerry) {
        super(price, maturation, color, name);
        this.isForestBerry = isForestBerry;
    }

    @Override
    public String toString() {
        return super.toString() + "\tBerry\t{ " +
                "\tisForestBerry=" + isForestBerry +
                ",\ttype=" + type +
                " }";
    }

    @Override
    public TypeProduct getType() {
        return type;
    }
}
