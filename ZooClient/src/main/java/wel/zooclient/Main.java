/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wel.zooclient;

import java.util.List;
import wel.AnimalClassificationType;
import wel.AnimalDetailsType;
import wel.LastVaccinationType;
import wel.ParentsType;

/**
 *
 * @author student
 */
public class Main {

    public static void checkPopularity(int id) {
        try {
            wel.Hello_Service service = new wel.Hello_Service();
            wel.Hello port = service.getHelloPort();
            List<Object> result = port.checkPopularity(id);
            System.out.println("Testing checkPopularity");
            System.out.println("Result:");
            for (Object object : result) {
                System.out.println(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void checkHealth(String name) {
        try {
            wel.Hello_Service service = new wel.Hello_Service();
            wel.Hello port = service.getHelloPort();
            List<Object> result = port.checkHealth(name);
            System.out.println("Testing checkHealth");
            System.out.println("Result:");
            for (Object object : result) {
                System.out.println(object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addAnimal(String name, String motherName, String fatherName, int height, float weight, String dateOfBirth, String domain, String clazz, String family, String genus, String order, String vaccineName, String vaccinationDate) {

        try {
            ParentsType parents = new ParentsType();
            parents.setFatherName(fatherName);
            parents.setMotherName(motherName);
            AnimalDetailsType animalDetails = new AnimalDetailsType();
            animalDetails.setHeight(height);
            animalDetails.setWeight(weight);
            animalDetails.setDateOfBirth(dateOfBirth);
            AnimalClassificationType animalClassification = new AnimalClassificationType();
            animalClassification.setDomain(domain);
            animalClassification.setClazz(clazz);
            animalClassification.setFamily(family);
            animalClassification.setGenus(genus);
            animalClassification.setOrder(order);

            LastVaccinationType lastVaccination = new LastVaccinationType();
            lastVaccination.setVaccinationDate(vaccinationDate);
            lastVaccination.setVaccineName(vaccineName);
            wel.Hello_Service service = new wel.Hello_Service();
            wel.Hello port = service.getHelloPort();
            int result = port.addAnimal(name, parents, animalDetails, animalClassification, lastVaccination);
            System.out.println("Testing checkHealth");
            System.out.println("Result (id of newly created animal):");

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        addAnimal("Wojtek", "Agnieszka", "Marek", 175, (float)74.0, "06-07-1997 19:50:20", "Gorilla", "Gorilla", "Gorilla", "Gorilla", "Gorilla", "Monsanto", "06-08-2019 19:50:20");
        checkHealth("Przemyslaw");
        checkPopularity(1);
        checkHealth("Wojtek");

    }

}
