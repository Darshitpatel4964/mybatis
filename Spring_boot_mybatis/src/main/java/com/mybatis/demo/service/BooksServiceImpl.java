package com.mybatis.demo.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;
import com.mybatis.demo.mapper.BooksMapper;
import com.mybatis.demo.model.Books;
import com.mybatis.demo.util.DbSession;

/**
 * This BooksServiceImpl.java class,service impl implements service class and contains all the logical codes.
 * @author Darshit Patel
 */

@Service
public class BooksServiceImpl implements BooksService{	

	private BooksMapper booksMapper;
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;

	public BooksServiceImpl() {
		sqlSessionFactory = DbSession.getSqlSessionFactory();
	}

	@Override
	public List<Books> getAll() {
		try {
			sqlSession = sqlSessionFactory.openSession();
			booksMapper = sqlSession.getMapper(BooksMapper.class);
			return booksMapper.findAll();
		} finally {
			sqlSession.close();
		}
	}

}