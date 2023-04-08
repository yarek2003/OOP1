package pro.sky.java.course2.oop1;

public class Hogwarts {
    private String name;
    private int power;
    private int distance;

    public Hogwarts (String name, int power, int distance){
        this.name = name;
        this.power = power;
        this.distance = distance;
}

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", distance=" + distance +
                '}';
    }
    public static void compareHogwarts (Hogwarts student1, Hogwarts student2){

        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем "+ student2.getName());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }
        else System.out.println("Студенты " + student1.getName() + " и " + student2.getName() + " равны мощностью магии");
    }

}
