package com.example.backend.repository;

import com.example.backend.model.DataItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataItem, Long> {}
