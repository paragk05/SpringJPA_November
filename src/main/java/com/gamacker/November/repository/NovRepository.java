package com.gamacker.November.repository;

import com.gamacker.November.model.November;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NovRepository extends JpaRepository<November,Integer>
{

}
