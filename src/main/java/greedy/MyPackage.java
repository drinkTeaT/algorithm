package greedy;

/**
 * Description
 * Author liuweibin
 * Date 2019/12/25 16:42
 **/
public class MyPackage {
}

enum Item {
    A(35, 10), B(30, 40), C(60, 30), D(50, 50), E(40, 35), F(10, 40), G(25, 30);
    private int weight;
    private int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
