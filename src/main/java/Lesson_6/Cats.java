package Lesson_6;

public class Cats extends Animals {

    protected String color;

    // создаем переменную, которая будет считать созданных котов
    static int amountCats = 0; {
        amountCats++;
    }

    public Cats (String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // ограничение в 200м
    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Коты столько не пробегают");
        }
        System.out.println("Кот пробегает " + length + "m");
    }

    // кошки не любят плавать
    @Override
    public void swim(int length) {
        System.out.println("Коты не плавают");
    }

    public void swim () {
        System.out.println("Коты не плавают");
    }

}

