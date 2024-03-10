package com.alejandroem.taskforce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejandroem.taskforce_backend.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
