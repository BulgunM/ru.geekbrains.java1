package Lesson_5;

public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.toString();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231215", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Mechanic", "ppetrov@mailbox.com", "89231231128", 20000, 29);
        persArray[2] = new Employee("Nikitin Egor", "Manager", "egorn@mailbox.com", "89231231393", 25000, 40);
        persArray[3] = new Employee("Nedelina Anna", "Accountant", "nanna@mailbox.com", "89231231343", 37000, 47);
        persArray[4] = new Employee("Antonova Irina", "Teacher", "antonova@mailbox.com", "89231231387", 22000, 25);

        Employee.isOlderThan40(persArray); // Выводит в консоль
    }
}


