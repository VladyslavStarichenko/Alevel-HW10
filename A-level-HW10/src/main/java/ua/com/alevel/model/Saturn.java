package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Saturn extends Planet{


    private double weight = 5.68 * Math.pow(10, 26);
    private double powRadius = 57.64 * Math.pow(10, 6);

    public Saturn() {
        super();
    }

    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
