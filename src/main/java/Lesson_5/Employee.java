package Lesson_5;

import java.util.Arrays;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String number, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Конструктор, который заполняет поля
     */
    public Employee () {
        this ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231215", 30000, 30);
    }

    /**
     *  Выводит информацию в консоль
     * @return
     */
    @Override
    public String toString() {
        System.out.println("Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}');

        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /**
     * Цикл, который проверяет кому больше 40 лет
     * @param persArray
     */
    public static void isOlderThan40 (Employee[] persArray) {

        for (int i = 0; i < persArray.length; i ++) {
            if (persArray[i].age > 40) {
                persArray[i].toString();
            }
        }
    }
}
