package com.example.vaccinationbookingsystem.repository;

import com.example.vaccinationbookingsystem.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findByEmailId(String oldEmail);

    List<Person> findByAgeAndName(int age, String name);
}
