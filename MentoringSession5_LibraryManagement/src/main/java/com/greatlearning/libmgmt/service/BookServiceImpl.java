package com.greatlearning.libmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.libmgmt.entity.Book;
import com.greatlearning.libmgmt.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {	
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public void deleteBookById(int id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public Book getBookById(int id) {
		//return bookRepository.findById(id)
		//		.orElseThrow(()->new RuntimeException("Book does not exists for Id : "+id));
		
		Optional<Book> result = bookRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new RuntimeException("Book does not exists for Id : "+id);
		}
		
	}
	
}