package com.springcore;

public class Student {

    private String studentName;
    private int id;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    public void studentInfo(){
        System.out.println("Student name is "+studentName+ " and Id is "+id);
    }
}

//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }