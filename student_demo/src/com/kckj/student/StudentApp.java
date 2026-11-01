package com.kckj.student;

import com .kckj .student .view .StudentView;
/**
 * 科创空间学生管理系统的入口(主类)
 * 整个程序从这里的main方法开始执行
 */
public class StudentApp {
    public static void main(String [] args) {
//创建StudentView对象，并显示主菜单
        new StudentView().mainMenu();
        System .out .println("===你已退出科创空间学生管理系统===");
    }
}