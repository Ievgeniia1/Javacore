package com.ganzina.app.classwork.lesson12;

/**
 * Created by Ievgeniia on 4/25/2017.
 */
public class Student extends Person{
    private String degree;

    public Student(String name, String university, int age) {
        super(name, university,age);
    }

    public void printStudentInfo(){
        System.out.println("Student's info:"+"\n"+"Name: "+getName()+" University: "+getUniversity()+" Age: "+getAge());
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void showDegree(){
         System.out.println("Student's degree: "+degree);
    }

}
