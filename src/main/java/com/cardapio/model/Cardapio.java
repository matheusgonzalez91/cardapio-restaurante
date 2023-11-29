package com.cardapio.model;

import com.cardapio.dto.CardapioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_cardapiorestaurante")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cardapio {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomeComida;
    private String precoComida;
    private String fotoComida;

    public Cardapio(CardapioRequestDTO data){
        this.nomeComida = data.nomeComida();
        this.precoComida = data.precoComida();
        this.fotoComida = data.fotoComida();
    }

}
