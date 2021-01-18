package ua.com.alevel.methodsImpl;

import org.reflections.Reflections;
import ua.com.alevel.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PlanetScanner {

    private List<String> planetsNames = new ArrayList<>();

    public PlanetScanner() {
        Reflections reflections = new Reflections("ua.com.alevel");
        Set<Class<? extends Planet>> planets = reflections.getSubTypesOf(Planet.class);
        for (Class planet: planets) {
            planetsNames.add(planet.getSimpleName());
        }
    }

        public void showPlanets(){
            System.out.println("Our Solar System: ");
            System.out.println(planetsNames);
        }

        public String planetToCheck(){
            Scanner planetToCheck = new Scanner(System.in);
            System.out.println("To get information about planet choose one!");
            return planetToCheck.nextLine();

        }
        public Object getPlanet(String planetToCheck){
        Planet default_Planet = new Earth();
        Planet planet;
        if(planetToCheck.equals("Earth")){
            return planet = new Earth();
        }
        else if(planetToCheck.equals("Jupiter")){
            return planet = new Jupiter();
        }
        else if(planetToCheck.equals("Mars")){
            return planet = new Mars();
        }
        else if(planetToCheck.equals("Mercury")){
            return planet = new Mercury();
        }
        else if(planetToCheck.equals("Neptune")){
            return planet = new Neptune();
        }
        else if(planetToCheck.equals("Saturn")){
            return planet = new Saturn();
        }
        else if(planetToCheck.equals("Uranus")){
            return planet = new Uranus();
        }
        else if(planetToCheck.equals("Venus")){
            return planet = new Venus();
        }
        else
            planet = default_Planet;
        return planet;
        }


}
