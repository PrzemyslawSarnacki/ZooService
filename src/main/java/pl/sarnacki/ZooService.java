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
//    static private List<AnimalWithId> animal = new ArrayList<>();

//    public static void main(String[] args) {
//        ParentsType parents = new ParentsType();
//        parents.setMotherName("");
//        parents.setFatherName("");
//        
//        AnimalDetailsType animalDetails = new AnimalDetailsType();
//        animalDetails.setHeight(120);
//        animalDetails.setWeight(12);
////        animalDetails.setDateOfBirth(2009-05-07T17:05:45.678Z);
//        
//        AnimalClassificationType animalClassification = new AnimalClassificationType();
//        animalClassification.setClazz("fdsaf");
//        animalClassification.setDomain("fdsaf");
//        animalClassification.setFamily("fdsaf");
//        animalClassification.setGenus("fdsaf");
//        animalClassification.setOrder("fdsaf");
//        
//        LastVaccinationType lastVaccination = new LastVaccinationType();
////        lastVaccination.setVaccinationDate(value);
//        lastVaccination.setVaccineName("value");
//        
//        addAnimal("name", parents, animalDetails, animalClassification, lastVaccination);
//    }
    public int addAnimal(java.lang.String name, org.example.newservice.ParentsType parents, org.example.newservice.AnimalDetailsType animalDetails, org.example.newservice.AnimalClassificationType animalClassification, org.example.newservice.LastVaccinationType lastVaccination) {
        //TODO implement this method
        System.out.println("Dodaje zwierzecie");
        
        AddAnimal animal = new AddAnimal();
        animal.setName(name);
        animal.setParents(parents);
        animal.setAnimalDetails(animalDetails);
        animal.setAnimalClassification(animalClassification);
        animal.setLastVaccination(lastVaccination);
        
//        for(int i = 0; i < animal.size(); ++i){
//            Integer nextId = nextId();
//                
//        }
        return animal.size() + 1;
    }
    
    public int searchAnimal(java.lang.String name, java.lang.String dateOfBirth){
        
        for(AnimalWithId animalWithId : animalWithId){
        
            if (animalWithId.equals(name)){

            }
        }
        return 0;
    }
    
    private static Integer nextId(){
        return currentId++;
    }
    
}
