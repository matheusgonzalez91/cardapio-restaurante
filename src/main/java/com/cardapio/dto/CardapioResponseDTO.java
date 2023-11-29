package com.cardapio.dto;

import com.cardapio.model.Cardapio;

import java.util.UUID;

public record CardapioResponseDTO(UUID id, String nomeComida, String precoComida, String fotoComida) {

    public CardapioResponseDTO(Cardapio cardapio){
        this(cardapio.getId(), cardapio.getNomeComida(), cardapio.getPrecoComida(), cardapio.getFotoComida());
    }

}
