package com.kckj.student.domain;

public class Student {
    //成员属性(字段/成员变量)
    private int id ;         //编号
    private String name ;    //姓名
    private String gender ;  //性别
    private String major ;   //专业
    private String phone ;   //电话
    private String state;   //状态(在组/退出)
    //构造器：创建Student对象时，一次性给所有属性赋值
    public Student(int id , String name , String gender , String major , String phone , String
            state) {
        this.id = id ;
        this.name = name ;
        this .gender = gender ;
        this .major = major ;
        this.phone = phone ;
        this .state = state ;
    }
    //getter和setter：因为属性是private的，外部类需要通过它们来访问/修改属性
    public int getId() {
        return id ;
    }
    public void setId(int id) {
        this.id = id ;
    }
    public String getName() {
        return name ;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public String getGender() {
        return gender ;
    }
    public void setGender(String gender) {
        this .gender = gender ;
    }
    public String getMajor() {
        return major ;
    }
    public void setMajor(String major) {
        this .major = major ;
    }
    public String getPhone() {
        return phone ;
    }
    public void setPhone(String phone) {
        this.phone = phone ;
    }
    public String getState() {
        return state ;
    }
    public void setState(String state) {
        this .state = state ;
    }
    //为了方便的输出成员信息，我们重写toString
//编号 姓名 性别 专业 电话 状态(在组/退出)
    @Override
    public String toString() {
        return id +
                "\t\t " + name +
                "\t " + gender +
                "\t " + major +
                "\t\t " + phone +
                "\t " + state ;
    }
}