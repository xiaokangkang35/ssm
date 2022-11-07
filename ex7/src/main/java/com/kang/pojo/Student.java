package com.kang.pojo;

public class Student {
    private String sname;
    private int age;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
