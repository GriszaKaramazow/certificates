package com.oncoarendi.certificates.data.service;

import com.oncoarendi.certificates.data.entity.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;
import javax.persistence.Lob;
import java.time.LocalDate;

@Service
public class BookService extends CrudService<Book, Integer> {

    private BookRepository repository;

    public BookService(@Autowired BookRepository repository) {
        this.repository = repository;
    }

    @Override
    protected BookRepository getRepository() {
        return repository;
    }

}
