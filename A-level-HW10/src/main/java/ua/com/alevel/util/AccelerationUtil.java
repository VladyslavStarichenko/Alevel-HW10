package ua.com.alevel.util;

public class AccelerationUtil {

    private static final double gravConst = 6.674 * Math.pow(10, -11);

    public static double freeFallAcceleration(double powRadius, double weight) {
        return gravConst * weight / Math.pow(powRadius, 2);
    };
}
