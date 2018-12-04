import java.util.ArrayList;

public class Name  {
    private String name;
    private ArrayList<Number> list;

    public Name(String name) {
        this.name = name;
        list = new ArrayList<Number>();
    }

    public String getName() {
        return name;
    }

    public Number addNumber(String num)
    {
        if (list.size()>0) {
            for (Number number : list) {
                if (number.getNumber().equals(num)) return number;
            }
        }
        Number temp = new Number(num);
        list.add(temp);
        return temp;
    }

    public ArrayList<Number> getNumbers() {
        return list;
    }
}
