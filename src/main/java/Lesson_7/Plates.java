package Lesson_7;

import java.util.Scanner;

public class Plates {

    int foodCount;
    private int plateCapacity;

    public Plates(int foodCount) {
        this.foodCount = foodCount;
        this.plateCapacity = 150;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getPlateCapacity() {
        return plateCapacity;
    }

    public void setPlateCapacity(int plateCapacity) {
        this.plateCapacity = plateCapacity;
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Plates{" +
                "foodCount=" + foodCount +
                ", plateCapacity=" + plateCapacity +
                '}';
    }

    public void decreaseFood (int appetite) {
        if (foodCount >= appetite) {
            foodCount -= appetite;
        }
    }

    /**
     * добавить метод, который позволит добавлять еду в тарелку
     */
    public void addFoodToPlate(){
        Scanner scanner = new Scanner(System.in);
        int additionFood;
        System.out.println("Сколько нужно добавить еды?");
        additionFood = scanner.nextInt();
        System.out.println("Еды в тарелке теперь: " + (foodCount + additionFood));
    }
}







