package com.magaintelliflow.controller;


import com.magaintelliflow.entity.Employee;
import com.magaintelliflow.service.DataMigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/migrate")
public class DataMigrationController {

    @Autowired
    private DataMigrationService dataMigrationService;

    @GetMapping("/getData")
    public List<Employee> getData(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size,
                                  @RequestParam(defaultValue = "empId") String sortBy,
                                  @RequestParam(defaultValue = "asc") String direction){

        Page<Employee> pageObject =  dataMigrationService.getData(page, size, sortBy, direction);
        List<Employee> list = pageObject.getContent();
        return list;
    }


}
