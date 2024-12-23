package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.TaskCategory;

public interface TaskCategoryRepository extends JpaRepository<TaskCategory, Integer>{

}
