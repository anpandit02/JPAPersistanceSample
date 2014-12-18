package com.anirudh.service;
import java.util.List;
import com.anirudh.entities.Employee;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("Employee")
public class EmployeeService {
	
	@PersistenceContext
	EntityManager entityManager;
		
	@GET
    @Produces("application/json")
	@SuppressWarnings("unchecked")
    public List<Employee> getEmployee() {			
		return entityManager.createQuery("SELECT employee FROM Employee employee").getResultList();
    }

}
