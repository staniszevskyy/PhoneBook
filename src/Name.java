import java.util.ArrayList;

public class Name extends NameList{
    private String name;
    private ArrayList<Number> list;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
