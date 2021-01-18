package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Venus extends Planet{



    private double weight = 4.864 * Math.pow(10, 24);
    private double powRadius = 6.051 * Math.pow(10, 6);

    public Venus() {
        super();
    }
    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
