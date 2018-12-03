import java.util.ArrayList;

public class List {
    private ArrayList<PhoneList> list ;

    public ArrayList<PhoneList> init() {

        {
        PhoneList ksiazka = new PhoneList("Staniszewski");
        ksiazka.addNumber("1");
        ksiazka.addName("Mateusz");
        ksiazka.addNumber("5");
        ksiazka.addName("Miłosz");
            list.add(ksiazka);
        }
        //////
        {
            PhoneList ksiazka = new PhoneList("Kowalski");
            ksiazka.addNumber("2");
            ksiazka.addName("Mariusz");
            list.add(ksiazka);
        }

        {
            PhoneList ksiazka = new PhoneList("Podsiadlo");
            ksiazka.addNumber("3");
            ksiazka.addName("Ewelina");
            list.add(ksiazka);
        }

        {
            PhoneList ksiazka = new PhoneList("Borek");
            ksiazka.addNumber("2115");
            ksiazka.addName("Borek");
            list.add(ksiazka);
        }

        return list;

    }
}
