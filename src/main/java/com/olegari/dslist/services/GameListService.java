package com.olegari.dslist.services;

import com.olegari.dslist.dto.GameListDTO;
import com.olegari.dslist.dto.GameMinDTO;
import com.olegari.dslist.entities.Game;
import com.olegari.dslist.entities.GameList;
import com.olegari.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
