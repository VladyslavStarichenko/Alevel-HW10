package ua.com.alevel;

import ua.com.alevel.methodsImpl.PlanetReporter;
import ua.com.alevel.methodsImpl.PlanetScanner;
import ua.com.alevel.model.*;

public class Main {
    public static void main(String[] args) {
        PlanetScanner planetScanner = new PlanetScanner();
        PlanetReporter planetReporter = new PlanetReporter();

        planetScanner.showPlanets();
        String planetToCheck = planetScanner.planetToCheck();
        Planet planet = (Planet) planetScanner.getPlanet(planetToCheck);
        double acceleration = planet.acceleration();
        planetReporter.getInfo(planetToCheck, acceleration);



    }

}
