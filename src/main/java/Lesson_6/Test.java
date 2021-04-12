package Lesson_6;

public class Test {

    public static void main(String[] args) {

        Cats cats = new Cats("Паскаль", "Белый");
        Dogs dogs = new Dogs("Лэсси", "Овчарка");

        System.out.println("Кота зовут: " + cats.getName());
        System.out.println("Он " + cats.getColor());

        System.out.println("Собаку зовут: " + dogs.getName());
        System.out.println("Она породы " + dogs.getBreed());

        cats.run(100);
        dogs.run(150);

        Cats cats1 = new Cats("Гризманн", "Серый");
        Dogs dogs1 = new Dogs("Симба", "Дворняга");
        Dogs dogs2 = new Dogs("Зевс", "Доберман");

        System.out.println("Кота зовут: " + cats1.getName());
        cats1.swim();

        System.out.println("Собаку зовут: " + dogs1.getName());
        dogs1.swim(600);

        // вывод количества котов, собак и животных в консоль
        System.out.println(Cats.amountCats);
        System.out.println(Dogs.amountDogs);
        System.out.println(Animals.amountAnimals);

    }
}


