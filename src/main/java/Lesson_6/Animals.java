package Lesson_6;

public class Animals {
    protected String name;

    // создаем переменную, которая будет считать всех созданных животных
    static int amountAnimals = 0; {
        amountAnimals++;
    }

    public Animals (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run (int length) {
        System.out.println("Животное бегает");
    }

    public void swim (int length) {
        System.out.println("Животное плавает");
    }
}
