package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter

public class Mercury extends Planet {



    private double weight = 3.285 * Math.pow(10, 23);
    private double powRadius = 2.439 * Math.pow(10, 6);

    public Mercury() {
        super();
    }

    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
