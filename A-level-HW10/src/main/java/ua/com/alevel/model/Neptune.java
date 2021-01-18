package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Neptune extends Planet{

    private double weight = 1.024 * Math.pow(10, 27);
    private double powRadius = 24.341 * Math.pow(10, 6);

    public Neptune() {
        super();
    }
    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
