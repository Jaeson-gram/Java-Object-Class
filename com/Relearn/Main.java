package com.Relearn;

public class Main extends Object {

    public static void main(String[] args) {
        // write your code here

        Student Uju = new Student("Uju", 23);
        System.out.println(Uju);
        // without overriding the toString method, the result of the println() above --> com.OJ.Student@1b28cdfa
//      The above commented output is the hashcode. More like an address to that object. A reference to it, for comparison I guess

        System.out.println();

        PrimarySchoolStudent desire = new PrimarySchoolStudent("Desire", 7, "Constance Ake");
        System.out.println(desire);


    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';

        return name + " is " + age;

    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    //Because we have overridden the toString() method in Student already...
    // we cannot directly access it from here again as our super class, but the Student class
    @Override
    public String toString(){
        return parentName + "'s kid, " + super.toString();
    }
}