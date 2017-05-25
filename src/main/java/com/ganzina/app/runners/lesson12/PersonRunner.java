package com.ganzina.app.runners.lesson12;

import com.ganzina.app.classwork.lesson12.Lecturer;
import com.ganzina.app.classwork.lesson12.Person;
import com.ganzina.app.classwork.lesson12.Student;
//import com.ganzina.app.classwork.lesson12.Student;

/**
 * Created by Ievgeniia on 4/25/2017.
 */
public class PersonRunner {
    /*public static void main(String[] args) {
        String name = "Amigo";
        String university="NAU";
        Student student = new Student(name,university);
        //student.university="NAU";
        student.age=20;
        student.printStudentInfo();
        Person person = new Person(name);


    }*/
    public static void main(String[] args) {
        String lecturerName = "Donald Duck";
        String university = "Harvard";
        int lecturerAge=45;
        Lecturer lecturer = new Lecturer(lecturerName,university,lecturerAge);
        lecturer.setFaculty("ISMBN");
        lecturer.setExperience(15);
        lecturer.setDegree("Master");
        lecturer.printLecturerInfo();

        System.out.println();
        String studentName="Student";
        int studentAge = 18;
        Student student = new Student(studentName,university,studentAge);
        student.printStudentInfo();
        student.setDegree("Intern");

        System.out.println();
        lecturer.showDegree();
        student.showDegree();


    }
}
