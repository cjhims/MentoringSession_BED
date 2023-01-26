package com.greatlearning.libmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.libmgmt.entity.Book;

//extending this interface to the JpaRepository will take care of creating sessions and
//session factories and will establish a connection
//also creation deletion updation will be taken care of by JPA libraries
//<entityname, primarykeydatatype>

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}