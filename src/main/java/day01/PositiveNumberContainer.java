package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
private List<Double> list = new ArrayList<>();

    public List<Double> getList() {
        return list;
    }

    public void addNumber(double number) {
    list.add(number);
}

}
