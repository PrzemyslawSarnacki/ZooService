package pl.sarnacki;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Szukamy zwierzaczka ....");
        
        String CSV_FILE = "C:/Users/Przemyslaw/Projects/ZooService/src/Lol.csv";

        CSVReader csv = new CSVReader(CSV_FILE);
        ArrayList<String[]> list = csv.read();
        ArrayList<String> list2 = csv.findByName("super", list);
        for (String strings : list2) {
            System.out.println(strings);

        }

        HealthParameters healthParameters = new HealthParameters();
        healthParameters.heartRate();
        healthParameters.mood();
        healthParameters.coordinates();
        String vaccinationDate = "10-01-2020 01:10:20";
        boolean vaccinationRequired = healthParameters.vaccinationRequired(vaccinationDate);

        Popularity popularity = new Popularity();
        popularity.visitorsToday();
        popularity.visitorsYesterday();
        popularity.meanVisitors();

    }
}
