package com.ganzina.app.classwork.lesson12;

import javax.sound.midi.Soundbank;

/**
 * Created by Ievgeniia on 4/25/2017.
 */
public class Person {
    private String name;
    private String university;
    private int age;

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person (String name, String university, int age){
        this.name=name;
        this.university=university;
        this.age=age;

    }

    public void printPersonInfo(){
        System.out.println("Person's info: "+name);

    }

    public void showDegree(){
        System.out.println("General degree");
    }



}
