package pl.sarnacki;

import java.util.ArrayList;
import java.util.List;
import org.example.newservice.PopularityType;

public class Main {
    public static List<Object> checkPopularity(int id) {
        System.out.println("Sprawdzamy czy nasz zwierzaczek jest popularny hehe ...");
        List<Object> popularityReturns = new ArrayList<>();
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
        checkPopularity(1);
    }
}
