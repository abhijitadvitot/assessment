package com.example.demo.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {

}
