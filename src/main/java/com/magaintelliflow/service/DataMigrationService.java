package com.magaintelliflow.service;

import com.magaintelliflow.entity.Employee;
import com.magaintelliflow.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DataMigrationService {

    @Autowired
    private EmployeeRepository repository;


    public Page<Employee>  getData(int page,int size,String sortBy,String direction){
        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Employee> pageObject =  repository.findAll(pageable);
        return pageObject;

    }
}
