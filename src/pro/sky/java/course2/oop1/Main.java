package pro.sky.java.course2.oop1;

import static pro.sky.java.course2.oop1.Gryffindor.compareGryffindor;
import static pro.sky.java.course2.oop1.Slytherin.compareSlytherin;
import static pro.sky.java.course2.oop1.Hufflepuff.compareHufflepuff;
import static pro.sky.java.course2.oop1.Ravenclaw.compareRavenclaw;
import static pro.sky.java.course2.oop1.Ravenclaw.compareHogwarts;

public class Main {
    public static void main(String[] args) {

Gryffindor harryPotter = new Gryffindor("Harry Potter", 93,80,52,88,78);
Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 85,79,68,17,52);
Gryffindor ronaldWeasley = new Gryffindor("Ronald Weasley", 58,25,61,16,36);
Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",77,55,67,55,18,58,68);
Slytherin grahamMontague = new Slytherin("Graham Montague",55,68,75,58,17,64,22);
Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",18,45,69,17,53,46,32);
Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",48,23,48,90,44);
Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",85,77,99,32,18);
Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 28,61,45,69,18);
Ravenclaw choChang = new Ravenclaw("Cho Chang",36,86,15,48,69);
Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 71,68,56,66,29);
Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 64,49,66,79,25);

System.out.println("Выводим описания студентов");
print(harryPotter);
print(dracoMalfoy);
print(zachariasSmith);
print(choChang);
System.out.println();
System.out.println("Сравниваем студентов из одного факультета");
compareGryffindor(harryPotter,hermioneGranger);
compareSlytherin(gregoryGoyle,dracoMalfoy);
compareHufflepuff(cedricDiggory,justinFinchFletchley);
compareRavenclaw(padmaPatil,marcusBelby);
System.out.println();
System.out.println("Сравниваем студентов из разных факультетов");
compareHogwarts(hermioneGranger,dracoMalfoy);
compareHogwarts(zachariasSmith,choChang);
    }
    public static void print(Hogwarts students) {
        System.out.println(students);
    }



}