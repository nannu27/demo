package com.example.demo.repository;

import com.example.demo.modal.ExcelData;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExcelRepo extends JpaRepository<ExcelData,String> {


    List<ExcelData> findAll(Specification specification);
}
