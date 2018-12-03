import java.util.ArrayList;

public class PhoneList extends Name {

    private ArrayList<Number> list;

    public PhoneList(String name)
    {
        super(name);
    }

    public Number addNumber(String num)
    {
        for (Number number : list){
            if (number.getNumber().equals(num)) return number;
        }
        Number temp = new Number(num);
        list.add(temp);
        return temp;
    }

}
