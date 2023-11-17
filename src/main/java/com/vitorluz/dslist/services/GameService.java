package com.vitorluz.dslist.services;

import com.vitorluz.dslist.dto.GameDTO;
import com.vitorluz.dslist.dto.GameMinDTO;
import com.vitorluz.dslist.entities.Game;
import com.vitorluz.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long Id){
        Game result = gameRepository.findById(Id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
         List<Game> result = gameRepository.findAll();
         return result.stream().map(x-> new GameMinDTO(x)).toList();
    }
}
