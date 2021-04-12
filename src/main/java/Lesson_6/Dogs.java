package Lesson_6;

public class Dogs extends Animals {
    protected String breed;

    // создаем переменную, которая будет считать созданных собак
    static int amountDogs = 0; {
        amountDogs++;
    }

    public Dogs(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // ограничение в 500м
    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println("Это гончая");
        }
        System.out.println("Собака пробегает " + length + "m");
    }

    // ограничение в 10м
    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Это собака спасатель");
        } else {
            System.out.println("Собака проплывает " + length + "m");
        }
    }
}