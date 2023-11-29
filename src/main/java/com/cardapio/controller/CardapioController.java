package com.cardapio.controller;


import com.cardapio.dto.CardapioRequestDTO;
import com.cardapio.dto.CardapioResponseDTO;
import com.cardapio.model.Cardapio;
import com.cardapio.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private CardapioRepository repository;

    @GetMapping
    public List<CardapioResponseDTO> getAll(){
        List<CardapioResponseDTO> cardapioList = repository.findAll().stream().map(CardapioResponseDTO::new).toList();
        return cardapioList;
    }

    @PostMapping
    public void saveCardapio(@RequestBody CardapioRequestDTO data){
        Cardapio cardapioData = new Cardapio(data);
        repository.save(cardapioData);
        return;
    }

}
