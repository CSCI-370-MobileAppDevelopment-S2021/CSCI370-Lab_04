package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public StudentDao(){

        Student ethanStudent = new Student("Ethan", "Stacia", "CSCI");
        Student brianStudent = new Student("Brian", "Arleen", "CITA");
        Student kristinStudent = new Student("Kristin","Esther","CSCI");
        Student jeniferStudent = new Student("Jenifer", "Mabel","CITA");
        Student duncanStudent = new Student("Duncan", "Duke","CSCI");
        listOfStudents.add(ethanStudent);
        listOfStudents.add(brianStudent);
        listOfStudents.add(kristinStudent);
        listOfStudents.add(jeniferStudent);
        listOfStudents.add(duncanStudent);
    }

    public ArrayList<Student> getListOfStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listOfStudents;
    }

}