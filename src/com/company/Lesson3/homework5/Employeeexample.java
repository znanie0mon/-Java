package com.company.Lesson3.homework5;


import java.util.*;
import java.util.Collection;


/**
 * Created by 123 on 26.03.2017.
 */
public class Employeeexample {

private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        inputEmploeyee(); // добавление сотрудников. Нет проверки на строку - поле salary
        outputEmployees(); // вывод сотрудников
        findEmployee(); // поиск сотрдника на заданной должности единственный минус нет проверки на число
        // плюс не учитываетается ввод на любой регистр
        sortListEmployees(); // сотрировка по полю фамилия обьекта класса Employee или  зарплата


    }

    private static void sortListEmployees () {

        System.out.println("=================Sorted by surname=================");
        Collections.sort(employees, new SortedBySurname());

        for(int i = 0; i<employees.size(); i++) {

            System.out.println(employees.get(i).getSurname() + " " + employees.get(i).getName() + " " +
                    employees.get(i).getPostion() + " " + employees.get(i).getSalary());
        }

        /*
* Тут почему то не работает итератор и вывод элементов из коллекции арейлиста по итератору
*
* */

/*        Iterator<Employee> t = employees.iterator();

        while (t.hasNext()) {

            System.out.println(t.next().getSurname() + t.next().getName() + t.next().getPostion() + t.next().getSalary());

        }
*/

        System.out.println("=================Sorted by salary=================");
        Collections.sort(employees, new SortedBySalary());


        for(int i = 0; i<employees.size(); i++) {

            System.out.println(employees.get(i).getSurname() + " " + employees.get(i).getName() + " " +
                    employees.get(i).getPostion() + " " + employees.get(i).getSalary());
        }


        /*
* Тут почему то не работает итератор и вывод элементов из коллекции арейлиста по итератору
*
*/


/*     Iterator<Employee> y = employees.iterator();

        while (y.hasNext()) {

            System.out.println(t.next().getSurname() + t.next().getName() + t.next().getPostion() + t.next().getSalary());

        }
*/

    }

    private static void findEmployee() {

        int counter = 0; // счетчик нужн для провекрки правильности введения должности
        String position  = keyboard("Введите название должности");

        for (int i = 0; i<employees.size(); i++) {
            if(employees.get(i).getPostion().equals(position)) {
                System.out.println(employees.get(i).getSurname() + " " + employees.get(i).getName() + " " +
                        employees.get(i).getPostion() + " " + employees.get(i).getSalary());
                counter++;
            }
        }

        /*
       * Тут почему то не работает итератор и вывод элементов из коллекции арейлиста по итератору
       * */
        /* Iterator<Employee> t = employees.iterator(); // тут почему



        do {
            if (t.next().getPostion().equals(position)) {

                System.out.println(t.next().getSurname() + t.next().getName() + t.next().getPostion() + t.next().getSalary());
                counter ++;
            }


        }while (t.hasNext()); */

            if (counter == 0) {
                System.out.println("Введите коректное название должности");
                findEmployee();
            }
    }

    private static void inputEmploeyee () {

        boolean continueInput = true;
        do {

            String surname = keyboard("Введите фамилию сотрудника ");
            String name = keyboard("Введите имя сотрудника ");
            String postion = keyboard("Введите должность сотрудника");
            String salary = keyboard("Введите зарплату сотрудника");
            int sal = Integer.valueOf(salary);
            Employee emp = new Employee();

            emp.setSurname(surname);
            emp.setName(name);
            emp.setPostion(postion);
            emp.setSalary(sal);

            employees.add(emp);

            continueInput = continueInputQuestion("Хотите ввести еще сотрудников");

        }while (continueInput);

    }

    private static void outputEmployees () {

        int countEmployees = 0;

        for(int i = 0; i<employees.size(); i++) {

            System.out.println(employees.get(i).getSurname() + " " + employees.get(i).getName() + " " +
                        employees.get(i).getPostion() + " " + employees.get(i).getSalary());
            countEmployees++;
        }

    /*    Iterator<Employee> e = employees.iterator();
                    System.out.println("Фамилия " + " Имя " + " Должность " + " Зарплата ");
        while (e.hasNext()) {

            System.out.println(e.next().getSurname() + e.next().getName() + e.next().getPostion() + e.next().getSalary());
            countEmployees++;
        }*/
do {
    if (countEmployees == 0) {
        System.out.println("Введите кол-во сотрудников больше 1");
        inputEmploeyee();
    }

}while (countEmployees == 1);

    }

    private static String keyboard(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    private static boolean continueInputQuestion(String inputBody) {
        String reply = keyboard("  Input another " + inputBody
                + "? (y - Yes, n - No)");
        if (reply.compareToIgnoreCase("n") == 0) {
            return false;
        } else {
            return true;
        }
    }

}
