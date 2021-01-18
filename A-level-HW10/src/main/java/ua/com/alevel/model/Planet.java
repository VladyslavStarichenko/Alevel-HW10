package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Planet implements PlanetAcceleration{

 private double weight;
 private double powRadius;

}
