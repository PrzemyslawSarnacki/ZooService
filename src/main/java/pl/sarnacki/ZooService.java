/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sarnacki;

import javax.jws.WebService;
import java.util.List;
import java.util.ArrayList;
import pl.sarnacki.AnimalWithId;
import org.example.newservice.AddAnimal;
import org.example.newservice.SearchAnimal;
import org.example.newservice.AnimalDetailsType;
import org.example.newservice.ParentsType;
import org.example.newservice.PopularityType;
import org.example.newservice.AnimalClassificationType;
import org.example.newservice.LastVaccinationType;

/**
 *
 * @author student
 */
@WebService(serviceName = "ZooService", portName = "ZooServiceSOAP", endpointInterface = "org.example.newservice.ZooService", targetNamespace = "http://www.example.org/NewService/", wsdlLocation = "WEB-INF/wsdl/ZooService.wsdl")
public class ZooService {
    static private Integer currentId = 0;
    static private List<AnimalWithId> animals = new ArrayList<>();
    static private String CSV_FILE = "C:/Users/Przemyslaw/Projects/ZooService/src/Lol.csv";

    // static private List<AnimalWithId> animal = new ArrayList<>();

    // public static void main(String[] args) {
    // ParentsType parents = new ParentsType();
    // parents.setMotherName("");
    // parents.setFatherName("");
    //
    // AnimalDetailsType animalDetails = new AnimalDetailsType();
    // animalDetails.setHeight(120);
    // animalDetails.setWeight(12);
    //// animalDetails.setDateOfBirth(2009-05-07T17:05:45.678Z);
    //
    // AnimalClassificationType animalClassification = new
    // AnimalClassificationType();
    // animalClassification.setClazz("fdsaf");
    // animalClassification.setDomain("fdsaf");
    // animalClassification.setFamily("fdsaf");
    // animalClassification.setGenus("fdsaf");
    // animalClassification.setOrder("fdsaf");
    //
    // LastVaccinationType lastVaccination = new LastVaccinationType();
    //// lastVaccination.setVaccinationDate(value);
    // lastVaccination.setVaccineName("value");
    //
    // addAnimal("name", parents, animalDetails, animalClassification,
    // lastVaccination);
    // }
    public int addAnimal(String name, org.example.newservice.ParentsType parents,
            org.example.newservice.AnimalDetailsType animalDetails,
            org.example.newservice.AnimalClassificationType animalClassification,
            org.example.newservice.LastVaccinationType lastVaccination) {
        // TODO implement this method
        System.out.println("Dodaje zwierzaczka ...");
        CSVReader csv = new CSVReader(CSV_FILE);
        
        ArrayList<String[]> list = csv.read();
        int id = csv.getIncrementedId(list);
        String idString = Integer.toString(id);
        String[] dataToWrite = { idString, name, parents.getMotherName(), parents.getFatherName(),
            animalDetails.getHeight(), animalDetails.getWeight(), animalDetails.getDateOfBirth(),
                animalClassification.getDomain(), animalClassification.getFamily(), animalClassification.getGenus(),
                animalClassification.getOrder(), animalClassification.getClazz(), lastVaccination.getVaccineName(),
                lastVaccination.getVaccinationDate() };
        csv.write(dataToWrite);
        
        
        return id;
    }

    public int searchAnimal(String name, String dateOfBirth) {
        
        for (AnimalWithId animalWithI : animalWithId) {
            
            if (animalWithI.equals(name)) {
                
            }
        }
        return 0;
    }

    public static List checkHealth(String name) {
        System.out.println("Sprawdzamy czy nasz zwierzaczek jest zdrowy :( ...");
        List healthReturns = new ArrayList<>();
        CSVReader csv = new CSVReader(CSV_FILE);
        ArrayList<String[]> list = csv.read();
        ArrayList<String> animalInfo = csv.findByCategory(name, list, "Name");
        
        String motherName = animalInfo.get(2);
        String fatherName = animalInfo.get(3);
        String vaccinationDate = animalInfo.get(13);

        ParentsType parentsType = new ParentsType();
        parentsType.setFatherName(fatherName);
        parentsType.setMotherName(motherName);
        
        HealthParameters healthParameters = new HealthParameters();
        double heartRate = healthParameters.heartRate();
        String mood = healthParameters.mood();
        double[] coordinates = healthParameters.coordinates();
        boolean vaccinationRequired = healthParameters.vaccinationRequired(vaccinationDate);
        
        
        healthReturns.add(parentsType);
        

        return healthReturns;
    }
    
    public List checkPopularity(int id) {
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
        popularityType.setMeanVisitors(meanVisitors);
        popularityReturns.add(popularityType);
        popularityReturns.add(name);

        return popularityReturns;

    }

    public static void main(String[] args) {
        System.out.println("lollll");
    }

}
