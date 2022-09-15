package lab_2;

import lab_2.Enums.Colors;
import lab_2.Enums.RipeningSeason;

public class Product implements IProduct {
    private double price;
    private RipeningSeason maturation;
    private Colors color;
    private String name;

    public Product(double price, RipeningSeason maturation, Colors color, String name) {
        this.price = price;
        this.maturation = maturation;
        this.color = color;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public RipeningSeason getMaturation() {
        return maturation;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product\t{ " +
                "price=" + price +
                ",\tmaturation=" + maturation +
                ",\tcolor=" + color +
                ",\tname='" + name + '\'' +
                " }";
    }
}
