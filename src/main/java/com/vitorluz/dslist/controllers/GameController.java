package com.vitorluz.dslist.controllers;


import com.vitorluz.dslist.dto.GameMinDto;
import com.vitorluz.dslist.entities.Game;
import com.vitorluz.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;
   @GetMapping
    public List<GameMinDto> findAll(){
        List<Game> result = gameService.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;

    }
}
