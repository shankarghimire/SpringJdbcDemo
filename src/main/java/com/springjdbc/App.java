package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
    	//System.out.println("Testing-Context loaded...");
    
    	StudentDao studentDao = applicationContext.getBean("studentDao",StudentDao.class);
    	
    	Student student = new Student();
    	student.setName("Harry");
    	student.setAddress("Toronto");
    	int result = studentDao.insert(student);
    	System.out.println("Number of records inserted : " + result);
    	
    	
    	
    	
    }
}
