import java.lang.Math;
import java.util.Random;

import javax.swing.PopupFactory;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Popularity {
    public final int visitorsYesterday() {
        Random rnd = new Random();
        return rnd.nextInt(200); 
    }

    public final int visitorsToday() {
        Random rnd = new Random();
        return rnd.nextInt(200); 
    }
    public final int meanVisitors() {
        return (visitorsToday() + visitorsYesterday())/2;
    }
}
