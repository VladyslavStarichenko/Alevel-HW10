package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter

public class Jupiter extends Planet {


    private double weight = 1.89 * Math.pow(10, 27);
    private double powRadius = 7.1492 * Math.pow(10, 7);

    public Jupiter() {
        super();
    }
    @Override
    public double acceleration() {

     return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
