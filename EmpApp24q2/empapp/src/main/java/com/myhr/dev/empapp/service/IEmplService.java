package com.myhr.dev.empapp.service;

import com.myhr.dev.empapp.entity.Dept;
import com.myhr.dev.empapp.entity.Empl;

import java.util.List;

public interface IEmplService {

    public List<Empl>   getAllEmpls() ;

    public List<Dept>   getAllDepts() ;

}
