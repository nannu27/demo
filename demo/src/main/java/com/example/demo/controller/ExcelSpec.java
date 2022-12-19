package com.example.demo.controller;

import com.example.demo.modal.ExcelData;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;


public class ExcelSpec {

    public   static Specification<ExcelData> getSpec(String msn,String productName,String taxonomy){
        return  (((root, query, criteriaBuilder) -> {
//            Predicate<ExcelData> predicate=new Process<ExcelData>();
            List<Predicate> predicate=new ArrayList<>();
            if(msn!=null&&!(msn.isEmpty()))
                predicate.add((Predicate) criteriaBuilder.equal(root.get("msn"),msn));
            if(productName!=null&&!(productName.isEmpty()))
//                predicate.add((Predicate) criteriaBuilder.equal(root.get("productName"),productName));
                predicate.add((Predicate) criteriaBuilder.like(root.get("productName"),"%"+productName+"%"));
            if(taxonomy!=null&&!(taxonomy.isEmpty()))
                predicate.add((Predicate) criteriaBuilder.equal(root.get("taxonomyCode"),taxonomy));
            return  criteriaBuilder.and(predicate.toArray(new Predicate[0]));

        }));
    }
}
