package com.martin.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martin.farmacia.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
