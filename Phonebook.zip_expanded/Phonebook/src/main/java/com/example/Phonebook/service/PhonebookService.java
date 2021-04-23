package com.example.Phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phonebook.domain.Phonebook;
import com.example.Phonebook.repository.PhonebookRepository;

@Service
public class PhonebookService {
	@Autowired
	private PhonebookRepository repo;
	
	public List<Phonebook> listAll() {
	return repo.findAll();
	}
public void save(Phonebook std) {
	repo.save(std);
}

public Phonebook get(long id) {
	return repo.findById(id).get();
}
public void delete(long id) {
	repo.deleteById(id);
}
}
