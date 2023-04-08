package pro.sky.java.course2.oop1;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int creativity;
    public Ravenclaw (String name, int power, int distance,  int intelligence, int wisdom, int creativity){
        super(name, power, distance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public static void compareRavenclaw (Ravenclaw student1, Ravenclaw student2){
        int sumFirstStudent = student1.intelligence + student1.wisdom + student1.creativity;
        int sumSecondStudent = student2.intelligence + student2.wisdom + student2.creativity;
        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(student1.getName() + " более умелый, чем "+ student2.getName());
        } else if (sumFirstStudent < sumSecondStudent) {
            System.out.println(student2.getName() + " более умелый, чем " + student1.getName());
        }
        else System.out.println("Студенты " + student1.getName() + " и " + student2.getName() + " равны в сумме умений");
    }
    @Override
    public String toString() {
        return super.toString()+
                "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                '}';
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

}
