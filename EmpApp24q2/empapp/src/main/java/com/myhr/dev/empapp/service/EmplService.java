package com.myhr.dev.empapp.service;

import com.myhr.dev.empapp.repository.DeptRepository;
import com.myhr.dev.empapp.repository.EmplRepository;
import com.myhr.dev.empapp.entity.Dept;
import com.myhr.dev.empapp.entity.Empl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplService implements IEmplService {
    @Autowired
    private EmplRepository emplRepository;

    @Autowired
    private DeptRepository deptRepository;

    @Override
    public List<Empl> getAllEmpls() {
        System.out.println("get empl ");
        return emplRepository.findAll();
    }

    public Empl postNewEmpl( Empl empl ) {
        System.out.println("Post empl " + empl.getFname());
        emplRepository.saveAndFlush(empl);

        // check dob
        return empl ;
    }

    @Override
    public List<Dept> getAllDepts() {
        return deptRepository.findAll();
    }

    public Dept postNewDept( Dept dept ) {

        deptRepository.saveAndFlush(dept); //

        // check dept
        return dept ;
    }

}
