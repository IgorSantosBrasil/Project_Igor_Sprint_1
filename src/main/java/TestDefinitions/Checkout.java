package TestDefinitions;

/**
 * Created by dell on 11.7.2017 г..
 */
public class Checkout {

    private int totalcound;

    public void add(int applecount, int bananacound) {
        totalcound = applecount + bananacound;
    }

    public int getResult() {
        return totalcound;
    }

}


