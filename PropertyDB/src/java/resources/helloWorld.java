/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sushmitha
 */
@Path("property")
public class helloWorld {
    
    
    //@PersistenceContext(name="PropertyDBPU")
    //private EntityManager entityManager;
    
    private List<Property> properties;
    
    /**
     * Creates a new instance of helloWorld
     */
    public helloWorld(){
              
    }
        
    /**
    * Retrieves representation of an instance of resources.helloworld
    * @return an instance of java.lang.String
    */
    @GET
    @Produces("text/html")
    public String getHtml() {
        //TODO return proper representation object
       // properties = entityManager.createNamedQuery(Property.FIND_ALL).getResultList();
        return "" + properties;
        
    } 
    
    
}
