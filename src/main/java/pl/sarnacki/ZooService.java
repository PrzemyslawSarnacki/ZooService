/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package wel;
package pl.sarnacki;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.example.newservice.CoordinatesType;
import org.example.newservice.HealthParametersType;
import org.example.newservice.ParentsType;
import org.example.newservice.PopularityType;
import org.example.newservice.AnimalClassificationType;
import org.example.newservice.AnimalDetailsType;
import org.example.newservice.LastVaccinationType;

/**
 *
 * @author student
 */
@WebService(serviceName = "ZooService")
public class ZooService {
    final private String CSV_FILE = "/home/student/NetBeansProjects/ZooService/src/DatabaseXD.csv";


    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "checkPopularity")
    public List<Object> checkPopularity(@WebParam(name = "id") int id) {
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
//        popularityReturns.add(name);
//        popularityReturns.add(visitorsToday);
//        popularityReturns.add(visitorsYesterday);
//        popularityReturns.add(meanVisitors);
        return popularityReturns;
    }

    /**
     * Web service operation
     * @param name
     * @return 
     */
    @WebMethod(operationName = "checkHealth")
    public List<Object> checkHealth(@WebParam(name = "name") String name) {
        System.out.println("Sprawdzamy czy nasz zwierzaczek jest zdrowy :( ...");
        List<Object> healthReturns = new ArrayList<>();
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
        int heartRate = healthParameters.heartRate();
        String mood = healthParameters.mood();
        double[] coordinates = healthParameters.coordinates();
        boolean vaccinationRequired = healthParameters.vaccinationRequired(vaccinationDate);
        CoordinatesType coordinatesType = new CoordinatesType();
        coordinatesType.setLatitude((float) coordinates[0]);
        coordinatesType.setLongitude((float) coordinates[1]);

        HealthParametersType healthParametersType = new HealthParametersType();
        healthParametersType.setCoordinates(coordinatesType);
        healthParametersType.setHeartRate(heartRate);
        healthParametersType.setMood(mood);
        healthParametersType.setVaccinationRequired(vaccinationRequired);
        healthParametersType.setHealthState(mood);

        healthReturns.add(healthParametersType);
        healthReturns.add(parentsType);
//        healthReturns.add(motherName);
//        healthReturns.add(fatherName);
//        healthReturns.add(heartRate);
//        healthReturns.add(vaccinationDate);
//        healthReturns.add(mood); 
        return healthReturns;
    }

    /**
     * Web service operation
     * @param name
     * @param parents
     * @param animalDetails
     * @param lastVaccination
     * @param animalClassification
     * @return 
     */
    @WebMethod(operationName = "addAnimal")
    public int addAnimal(@WebParam(name = "name") String name, @WebParam(name = "parents") ParentsType parents, @WebParam(name = "animalDetails") AnimalDetailsType animalDetails, @WebParam(name = "animalClassification") AnimalClassificationType animalClassification, @WebParam(name = "lastVaccination") LastVaccinationType lastVaccination) {
        //TODO write your implementation code here:
        System.out.println("Dodaje zwierzaczka ...");
        CSVReader csv = new CSVReader(CSV_FILE);

        ArrayList<String[]> list = csv.read();
        int id = csv.getIncrementedId(list);
        String idString = Integer.toString(id);
        String[] dataToWrite = {idString, name, parents.getMotherName(), parents.getFatherName(),
            Float.toString(animalDetails.getHeight()), Float.toString(animalDetails.getWeight()), animalDetails.getDateOfBirth(),
            animalClassification.getDomain(), animalClassification.getFamily(), animalClassification.getGenus(),
            animalClassification.getOrder(), animalClassification.getClazz(), lastVaccination.getVaccineName(),
            lastVaccination.getVaccinationDate()};
        csv.write(dataToWrite);

        return id;
        
    }

    
}
