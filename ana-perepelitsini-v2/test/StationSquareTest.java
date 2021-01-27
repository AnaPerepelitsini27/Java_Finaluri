import ge.edu.btu.Passanger;
import ge.edu.btu.Train;

import static org.junit.Assert.*;

public class StationSquareTest {

    @org.junit.Test
    public void main() {
        Passanger gio=new Passanger("Gio",true);
        Passanger nika=new Passanger("Nika",false);
        Passanger ana=new Passanger("Ana",true);

        Train train=new Train();

        assertEquals("Added to the train",train.addPassanger(gio));
        assertEquals("Refused from adding to the train",train.addPassanger(nika));
        assertEquals("Added to the train",train.addPassanger(ana));

    }
}