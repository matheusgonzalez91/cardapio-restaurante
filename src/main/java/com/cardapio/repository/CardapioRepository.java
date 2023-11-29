package com.cardapio.repository;

import com.cardapio.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardapioRepository extends JpaRepository<Cardapio, UUID>{
}
