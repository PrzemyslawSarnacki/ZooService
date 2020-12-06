package pl.sarnacki;

import java.util.ArrayList;
import java.util.List;
import org.example.newservice.PopularityType;

public class Main {
    public static List checkPopularity(int id) {
        System.out.println("Sprawdzamy czy nasz zwierzaczek jest popularny hehe ...");
        List popularityReturns = new ArrayList<>();
        CSVReader csv = new CSVReader(CSV_FILE);
        ArrayList<String[]> list = csv.read();
        ArrayList<String> animalInfo = csv.findByCategory(Integer.toString(id), list, "id");
        String name = animalInfo.get(1);

        Popularity popularity = new Popularity();
        int visitorsToday = popularity.visitorsToday();
        int visitorsYesterday = popularity.visitorsYesterday();
        int meanVisitors = popularity.meanVisitors();
        PopularityType popularityType = new PopularityType();
        popularityType.setVisitorsToday(visitorsToday);
        popularityType.setVisitorsYesterday(visitorsYesterday);
        popularityType.setMeanVisitorsCount(meanVisitors);
        popularityReturns.add(popularityType);
        popularityReturns.add(name);

        return popularityReturns;

    }

    public static void main(String[] args) {
        System.out.println("lollll");
        ZooService.checkPopularity(1);
    }
    // public static void main(String[] args) {
    // System.out.println("Szukamy zwierzaczka ....");

    // String CSV_FILE = "C:/Users/Przemyslaw/Projects/ZooService/src/Lol.csv";

    // CSVReader csv = new CSVReader(CSV_FILE);
    // ArrayList<String[]> list = csv.read();
    // ArrayList<String> list2 = csv.findByName("super", list);
    // for (String strings : list2) {
    // System.out.println(strings);

    // }

    // HealthParameters healthParameters = new HealthParameters();
    // healthParameters.heartRate();
    // healthParameters.mood();
    // healthParameters.coordinates();
    // String vaccinationDate = "10-01-2020 01:10:20";
    // boolean vaccinationRequired =
    // healthParameters.vaccinationRequired(vaccinationDate);

    // Popularity popularity = new Popularity();
    // popularity.visitorsToday();
    // popularity.visitorsYesterday();
    // popularity.meanVisitors();

    // }
}
