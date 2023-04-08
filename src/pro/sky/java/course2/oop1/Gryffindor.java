package pro.sky.java.course2.oop1;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, int power, int distance,  int nobility, int honor, int bravery){
        super(name, power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public static void compareGryffindor (Gryffindor student1, Gryffindor student2){
        int sumFirstStudent = student1.nobility + student1.honor + student1.bravery;
        int sumSecondStudent = student2.nobility + student2.honor + student2.bravery;
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
                "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
