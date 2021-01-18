package ua.com.alevel.model;


import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter

public class Earth extends Planet{

    private double weight = 5.972 * Math.pow(10, 24);
    private double powRadius = 6.371 * Math.pow(10, 6);

    public Earth() {
        super();
    }



    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
