/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sarnacki;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.example.newservice.AddAnimal;

/**
 *
 * @author student
 */

public class AnimalWithId extends AddAnimal{
    

    /**
     * This is a sample web service operation
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
