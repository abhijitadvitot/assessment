package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{

}
