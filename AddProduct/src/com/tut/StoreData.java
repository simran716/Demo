package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {
	public static void main( String[] args )  
    {  
        
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction t = session.beginTransaction(); //starting/beginning transaction 
          
        Employee e1=new Employee();     // transient state
            e1.setEmpid(126);   
            e1.setEmpName("Harish");    
            e1.setSalary(34000);   
         
       session.save(e1);  // persist state---> saving into database
      
       t.commit();  // commit() in DB
       System.out.println("successfully saved");    
        factory.close();  
        session.close();    //detached state
    }  
}  

