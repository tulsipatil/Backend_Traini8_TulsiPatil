package com.example.trainingcentersregistry.repositories;

import com.example.trainingcentersregistry.entities.Center;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepo extends JpaRepository<Center, Integer>
{
}
