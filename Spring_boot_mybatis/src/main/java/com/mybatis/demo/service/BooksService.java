package com.mybatis.demo.service;

import java.util.List;
import com.mybatis.demo.model.Books;

/**
 * This BooksService.java class, service is an interface and this class contains all the logical codes.
 * @author Darshit Patel
 */

public interface BooksService {

	List<Books> getAll();

}