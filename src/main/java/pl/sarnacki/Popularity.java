import java.lang.Math;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Popularity {
    public static int visitorsYesterday() {
        Random rnd = new Random();
        return rnd.nextInt(200); 
    }

    public static int visitorsToday() {
        Random rnd = new Random();
        return rnd.nextInt(200); 
    }
    public static int meanVisitors() {
        return (visitorsToday() + visitorsYesterday())/2;
    }

    public static void main(String[] args) {
        System.out.println(Popularity.meanVisitors());
    }

}
