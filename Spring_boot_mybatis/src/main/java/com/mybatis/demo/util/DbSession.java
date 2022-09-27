package com.mybatis.demo.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * This DbSession.java in session is the duration of one connection to the database 
 * and is handled by a JDBC Connection object.
 * @author Darshit Patel
 */

public class DbSession {

	private static SqlSessionFactory factory;

	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException("Error");
		}
		factory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return factory;
	}

}