
import java.util.ArrayList;

public class List {
    private final ArrayList<Surname> list = new ArrayList<>();

    public Surname addSurname (String surname , String name, String number){
        Surname sur = new Surname(surname);
        Name firstName = sur.addName(name);
        firstName.addNumber(number);
        return sur;
    }

    public void init() {


        list.add( addSurname("Staniszewski", "Mateusz", "1"));
        list.add( addSurname("Staniszewski", "Miłosz", "2"));
        list.add( addSurname("Słapiński", "Piotr" , "3"));
        list.add( addSurname("Słapiński", "Piotr", "404"));
        list.add( addSurname( "Borek", "Mateusz" , "2115"));
        list.add( addSurname( "Wójciuk", "Marceli" , "58"));
        list.add( addSurname( "Chmiela", "Adrian" , "8575"));
        list.add( addSurname( "Patecki", "Jakub" , "32"));
        list.add( addSurname( "Piwko", "Marcin" , "4"));



    }

    public void matchLastName(String lastName){
        for ( Surname sur : list ){
            if (sur.getSurname().equals(lastName)){
                ArrayList<Name> names = sur.getList();
                for (Name name : names){
                    System.out.println("Imię: " + name.getName() + " , nazwisko: " + sur.getSurname());
                    System.out.println("Numery kontaktowe: ");
                    for (Number num : name.getNumbers()){
                        System.out.println(num.getNumber());
                    }
                }
            }
        }
    }

    public void matchFirstName(String firstName){
        for (Surname sur : list){
            ArrayList<Name> names = sur.getList();
            for (Name name : names){
                if (name.getName().equals(firstName)){
                    System.out.println("Imię: " + name.getName() + " , nazwisko: " + sur.getSurname());
                    System.out.println("Numery kontaktowe: ");
                    for (Number num : name.getNumbers()){
                        System.out.println(num.getNumber());
                    }
                }
            }
        }
    }

    public void matchFullName(String fullName){
        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];

        for (Surname sur : list) {
            if (sur.getSurname().equals(lastName)){
                ArrayList<Name> names = sur.getList();
                for (Name name : names){
                    if (name.getName().equals(firstName)){
                        System.out.println("Imię: " + name.getName() + " , nazwisko: " + sur.getSurname());
                        System.out.println("Numery kontaktowe: ");
                        for (Number num : name.getNumbers()){
                            System.out.println(num.getNumber());
                        }
                    }
                }
            }
        }
    }
}
