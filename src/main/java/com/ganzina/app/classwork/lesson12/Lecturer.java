package com.ganzina.app.classwork.lesson12;

/**
 * Created by Ievgeniia on 4/25/2017.
 */
public class Lecturer extends Person {
    private String faculty;
    private int experience;
    private String degree;


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Lecturer(String name, String university, int age){
         super(name,university,age);
        }

    /*public void printPersonInfo(){
        System.out.println("Lecturer's info: "+name);

    }*/

    public void printLecturerInfo(){
        System.out.println("Faculty: "+faculty+"\nYears of experience: "+experience+"\nLecturer degree: "+
                degree+"\nUniversity: "+getUniversity()+"\nAge: "+getAge());
    }

    public void showDegree(){

        System.out.println("Lecturer's degree: "+degree);
    }

    }
