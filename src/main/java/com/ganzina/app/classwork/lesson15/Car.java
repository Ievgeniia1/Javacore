package com.ganzina.app.classwork.lesson15;

/**
 * Created by Ievgeniia on 5/5/2017.
 */
public class Car {

    private Engine engine;

    private Navigation navigation;

    private Wheel wheel;

    private Camera camera;

//    public Car(Engine engine) { //строгая композиция, Сar always has engine
//        this.engine = engine;
//    }


    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
