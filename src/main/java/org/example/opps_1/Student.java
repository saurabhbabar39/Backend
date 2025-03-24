package org.example.opps_1;

import java.lang.management.ThreadInfo;

public class Student {


    protected int age;
    int psp;
    String name;
    public int mobNo;
    private String emailID;
    protected float marks;


    public Student(int no){
        this.mobNo = no;
    }
    void changeBatch(){
        System.out.println("Changing Batch");
    }

    void joinClass(){
        System.out.println(name+ " is joining Class..");
    }

    void printDetails(){
        System.out.println("Name "+name);
        System.out.println("PSP "+psp);


        System.out.println("Age is "+age );
    }

    public void setEmail(String email) {
        emailID = email;
    }
    public String getEmail(){
        return emailID;
    }

}


