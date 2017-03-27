package com.company.Lesson3.homework5;

import java.util.Comparator;

/**
 * Created by 123 on 26.03.2017.
 */
public class Employee {

    private String surname;
    private String name;
    private String postion;
    private int salary;


    public void setSurname (String surname) {this.surname = surname;}
    public String getSurname () {return surname;}

    public void setName (String name) {this.name = name;}
    public String getName() {return name;}

    public void setPostion(String postion) {this.postion = postion;}
    public String getPostion() {return postion;}

    public void setSalary(int salary) {this.salary = salary;}
    public int getSalary() {return salary;}


}
class SortedBySurname implements Comparator<Employee> {

    public int compare(Employee obj1, Employee obj2) {

        String str1 = obj1.getSurname();
        String str2 = obj2.getSurname();

        return str1.compareTo(str2);
    }
}
class SortedBySalary implements Comparator<Employee> {

    public int compare(Employee obj1, Employee obj2) {

        int price1 = obj1.getSalary();
        int price2 = obj2.getSalary();

        if(price1 > price2) {
            return 1;
        }
        else if(price1 < price2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}



