package com.myhr.dev.empapp.repository;


import com.myhr.dev.empapp.entity.Empl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplRepository extends JpaRepository<Empl, Long> {
}
