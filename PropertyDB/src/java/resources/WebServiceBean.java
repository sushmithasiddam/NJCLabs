/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author sushmitha
 */
@Named(value = "webServiceBean")
@SessionScoped
public class WebServiceBean implements Serializable{
    
    
    private List<Property> properties;
    @PersistenceContext(name="PropertyDBPU")
    private EntityManager entityManager;
    /**
     * Creates a new instance of webServiceBean
     */
    public WebServiceBean() {
    }
    
    /**
     * 
     * @return List of 
     */
    public List<Property> getAllProperty(){
        properties = entityManager.createNamedQuery(Property.FIND_ALL).getResultList();
        
        return properties;
    }
    
}
