package lab_2;

import lab_2.Enums.Colors;
import lab_2.Enums.RipeningSeason;

public interface IProduct {
    public double getPrice();
    public RipeningSeason getMaturation();
    public Colors getColor();
    public String getName();
}
