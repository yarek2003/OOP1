package pro.sky.java.course2.oop1;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    @Override
    public String toString() {
        return super.toString()+
                "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff (String name, int power, int distance, int diligence, int loyalty, int honesty){
        super(name, power, distance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public static void compareHufflepuff (Hufflepuff student1, Hufflepuff student2){
        int sumFirstStudent = student1.diligence + student1.loyalty + student1.honesty;
        int sumSecondStudent = student2.diligence + student2.loyalty + student2.honesty;
        if (sumFirstStudent > sumSecondStudent) {
            System.out.println(student1.getName() + " более умелый, чем "+ student2.getName());
        } else if (sumFirstStudent < sumSecondStudent) {
            System.out.println(student2.getName() + " более умелый, чем " + student1.getName());
        }
        else System.out.println("Студенты " + student1.getName() + " и " + student2.getName() + " равны в сумме умений");
    }
}
