

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;


import com.hibernate.model.Employee;

public class SimpleTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	
		SessionFactory sessionFactory;
		
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession(); 
		Employee employee = new Employee();
//		employee.setId(2);
		employee.setAddress("add1");
		employee.setAge(30);
		employee.setName("A");
		employee.setSalary(30000);
		Transaction tx = session.beginTransaction(); 
		session.save(employee); 
		System.out.println("Object saved successfully.....!!"); 
		tx.commit(); 
		session.close(); 
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		Configuration cfg = new Configuration(); 
//		cfg.configure("hibernate.cfg.xml"); 
//		SessionFactory factory = cfg.buildSessionFactory(); 
//		Session session = factory.openSession(); 
//		Employee employee = new Employee(); 
//		employee.setAddress("add1");
//		employee.setAge(30);
//		employee.setName("A");
//		employee.setSalary(30000);
//		Transaction tx = session.beginTransaction(); 
//		session.save(employee); 
//		System.out.println("Object saved successfully.....!!"); 
//		tx.commit(); 
//		session.close(); 
//		factory.close(); 
	} 
}
