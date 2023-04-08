package pro.sky.java.course2.oop1;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    @Override
    public String toString() {
        return super.toString()+
                "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public Slytherin (String name, int power, int distance, int cunning, int determination, int ambition,
                      int resourcefulness, int thirstForPower){
        super(name, power, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public static void compareSlytherin (Slytherin student1, Slytherin student2){
        int sumFirstStudent = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int sumSecondStudent = student2.cunning + student2.determination + student2.ambition+ student2.resourcefulness + student2.thirstForPower;
        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(student1.getName() + " более умелый, чем "+ student2.getName());
        } else if (sumFirstStudent < sumSecondStudent) {
            System.out.println(student2.getName() + " более умелый, чем " + student1.getName());
        }
        else System.out.println("Студенты " + student1.getName() + " и " + student2.getName() + " равны в сумме умений");
    }
}
