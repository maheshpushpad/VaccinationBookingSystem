package com.example.vaccinationbookingsystem.repository;

import com.example.vaccinationbookingsystem.Model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoseRepository extends JpaRepository<Dose,Integer> {

}
