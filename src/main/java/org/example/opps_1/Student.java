package org.example.opps_1;
public class Student {
    int age;
    int psp;
    String name;
    public int mobNo;
    private String emailID;
    protected float marks;

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

    public static class Testprotected extends Student {

        public static void main(String[] args) {
            Student s1 = new Student();
        }
    }
}


