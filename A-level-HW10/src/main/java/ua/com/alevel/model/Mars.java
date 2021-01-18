package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Mars extends Planet{


    private double weight = 6.39 * Math.pow(10, 23);
    private double powRadius = 3396 * Math.pow(10, 6);

    public Mars() {
        super();
    }

    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
