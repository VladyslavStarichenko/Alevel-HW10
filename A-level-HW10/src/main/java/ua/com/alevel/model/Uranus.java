package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Uranus extends Planet{


    private double weight = 8.68 * Math.pow(10, 25);
    private double powRadius = 26.559 * Math.pow(10, 6);

    public Uranus() {
        super();
    }

    @Override
    public double acceleration() {

        return AccelerationUtil.freeFallAcceleration(getPowRadius(), getWeight());
    }
}
