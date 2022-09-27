package com.mybatis;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.mybatis.model.Student;

/**
 * This file would have application level logic to insert records in the Student table. 
 * Create and save MyBatisInsert.java file as shown below 
 * @author Darshit Patel
 */

public class MyBatisInsert { 

   public static void main(String args[]) throws IOException{
      Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
      SqlSession session = sqlSessionFactory.openSession();
      
      //Create a new student object
      Student student = new Student("Darshit","CE", 10, 999808252, "dp123@gmail.com" ); 
            
      //Insert student data      
      session.insert("Student.insert", student);
      System.out.println("Student record inserted successfully");
      
      session.commit();
      session.close();		
   }
   
}
