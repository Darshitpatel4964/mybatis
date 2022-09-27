package com.mybatis.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.mybatis.demo.model.Books;

/**
 * This is BooksMapper.java class,mapper provides functionality for converting between Java objects 
 * and matching JSON structures.
 * @author Darshit Patel
 */

@Mapper
public interface BooksMapper {

	public List<Books> findAll();

}