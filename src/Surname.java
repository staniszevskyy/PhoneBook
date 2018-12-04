
import java.util.ArrayList;

public class Surname {
    private final ArrayList<Name> list;
    private final String surname;


    public Surname(String surname) {
        this.surname = surname;
        list = new ArrayList<>();
    }

    public String getSurname() {
        return surname;
    }

    public Name addName(String name){

            for (Name temp : list) {
                if (temp.getName().equals(name)) return temp;
            }

        Name temp = new Name(name);
        list.add(temp);
        return temp;
    }

    public ArrayList<Name> getList() {
        return list;
    }
}
