package com.example.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 */
//客户端
public class Demeter1 {

    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法则的改进~~~");
        //创建了一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

//学校总部员工
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院的员工
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {//这里增加了10个员工到list
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id= " + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    //输出学院员工的信息
    public void printEmployee() {
        //获取到学院员工
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("-----------学院员工--------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校管理类
class SchoolManager {
    // 返回学校总部的所有员工
    public List<Employee> getAllEmployee() {
        ArrayList<Employee> list = new ArrayList<Employee>();
        for(int i = 0; i < 5; i++) {//这里增加了10个员工到list
            Employee collegeEmployee = new Employee();
            collegeEmployee.setId("学校总部员工id= " + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager sub) {
        //分析问题
        //1.将输出学院的员工方法， 封装到 CollegeManager
        sub.printEmployee();
        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----------学校总部员工--------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}