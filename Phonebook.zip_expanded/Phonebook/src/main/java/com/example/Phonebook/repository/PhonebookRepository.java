package com.example.Phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Phonebook.domain.Phonebook;

@Repository 
public interface PhonebookRepository extends JpaRepository<Phonebook, Long> {

}
