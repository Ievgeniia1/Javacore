package com.ganzina.app.runners.lesson15;

import com.ganzina.app.classwork.lesson15.*;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class CarEngineRunner {
    public static void main(String[] args) {
        String engineName = "V8Turbo";
        String wheels = "R17";

        Engine engine = new Engine(engineName);
        Wheel wheel = new Wheel(wheels); // wheel - строгая композиция

        Car car = new Car(engine, wheel);

        System.out.println(car.getEngine().getName());
        System.out.println(car.getNavigation().getName());

        Navigation navigationGoogle = new Navigation();
        navigationGoogle.setName("Google");
        car.setNavigation(navigationGoogle);

        Navigation navigationGarmin = new Navigation();
        navigationGarmin.setName("Garmin");
        car.setNavigation(navigationGarmin);

        Camera camera = new Camera(); //Camera - нестрогая композиция
        camera.setName("Sony");
        car.setCamera(camera);



    }
}
