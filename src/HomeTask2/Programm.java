package HomeTask2;
public class Programm {

    public static void main(String[] args) {
        Women anna = new Women("Anna", 160);
        Women maria = new Women("Maria", 170);
        Man anton = new Man("Anton", 170);
        Man vasya = new Man("Vasya", 190);

        System.out.println(anton.talk(anton));
        System.out.println(anton.endure(anton));
        System.out.println(anton.spendTimeTogether(anna, anton));
        System.out.println(anna.haveRelationship(anton));

    }
}


