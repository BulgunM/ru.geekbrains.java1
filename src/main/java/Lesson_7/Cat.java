package Lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name,int appetite, boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void eat(Plates plates) {
        if (plates.getFoodCount() > appetite) {
            plates.decreaseFood(appetite);
            System.out.println(this.name + " сыт ");
            this.satiety = true;
        } else {
            System.out.println(this.name + " не наелся ");
            this.satiety = false;
        }
    }
}