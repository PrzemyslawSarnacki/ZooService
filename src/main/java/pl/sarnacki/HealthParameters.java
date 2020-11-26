import java.lang.Math;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class HealthParameters {
    
    public static double heartRate() {
        Random rnd = new Random();
        int x = rnd.nextInt();
        double ecg = 5 * Math.sin(7 * x) * Math.sin(0.5 * x) * Math.cos(3.25 * x);
        return Math.abs(ecg) * 70;
    }

    public static String mood() {
        String[] moods = { "Great Mood", "Good Mood", "Decent Mood", "Average Mood", "Bad Mood", "Very Bad Mood" };
        Random random = new Random();
        int randomChoice = random.nextInt(moods.length);
        return moods[randomChoice];
    }

    public static double[] coordinates() {
        Random random = new Random();
        double latitude = random.nextDouble();
        double longitude = random.nextDouble();
        double[] coordinates = { latitude, longitude };
        return coordinates;
    }

    public static boolean vaccinationRequired(String start_date) {
        boolean isRequired = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String timeStamp = sdf.format(Calendar.getInstance().getTime());

        try {
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(timeStamp);
            long difference_In_Time = d2.getTime() - d1.getTime();
            long difference_In_Years = (difference_In_Time / (1000l * 60 * 60 * 24 * 365));

            if (difference_In_Years > 1) {
                isRequired = true;
            } else {
                isRequired = false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return isRequired;

    }

    public static void main(String[] args) {
        String start_date = "10-01-2020 01:10:20";

        System.out.println(HealthParameters.vaccinationRequired(start_date));
    }

}
