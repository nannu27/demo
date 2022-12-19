package com.example.demo.controller;

import com.example.demo.modal.ExcelData;
import com.example.demo.repository.ExcelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/search/*")
public class ApplicationController {
    @Autowired
    ExcelRepo excelRepo;


    @GetMapping("/list")
    public List<ExcelData> list(@RequestParam(value = "msn",required = false)String msn,
                                @RequestParam(value = "productName",required = false)String productName,
                                @RequestParam(value = "taxonomyCode",required = false)String taxonomyCode){
        Specification<ExcelData> specification=ExcelSpec.getSpec(msn,productName,taxonomyCode);
        return  excelRepo.findAll(specification);

    }
    @PostMapping("/addData")
    public  ExcelData addData(@RequestParam ExcelData excelData){
      return   excelRepo.save(excelData);

    }

}
