
import java.util.ArrayList;

public class NameList {
    private ArrayList<Name> list;



    public Name addName(String name){
        for (Name temp : list){
            if (temp.getName().equals(name)) return temp;
        }
        Name temp = new Name(name);
        list.add(temp);
        return temp;
    }
}
