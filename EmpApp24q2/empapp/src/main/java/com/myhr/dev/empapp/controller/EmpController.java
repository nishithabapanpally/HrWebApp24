package com.myhr.dev.empapp.controller;

import com.myhr.dev.empapp.entity.Dept;
import com.myhr.dev.empapp.entity.Empl;
import com.myhr.dev.empapp.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpController {

    @Autowired
    private EmplService emplService ;

    @GetMapping("/empl")
    private List<Empl> getEmpls(){

        return emplService.getAllEmpls();
    }

    @PostMapping("/empl")
    private Empl postEmpl(@RequestBody Empl empl){

        // ResponseEntity  setup header and body
        return emplService.postNewEmpl( empl );
    }

    @GetMapping("/dept")
    private List<Dept> getDepts(){
        return emplService.getAllDepts();
    }

    @PostMapping("/dept")
    private Dept postDepts(@RequestBody Dept dept){

        // ResponseEntity  setup header and body
        return emplService.postNewDept( dept );
    }

}

