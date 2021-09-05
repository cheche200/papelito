package com.juanicheche.papelito.service;

import com.juanicheche.papelito.domain.Game;
import com.juanicheche.papelito.domain.Name;
import com.juanicheche.papelito.repository.GameRepository;
import com.juanicheche.papelito.repository.NameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;
    private final NameRepository nameRepository;

    public void saveGame(Game game){
        nameRepository.saveAll(game.getNames());
        gameRepository.save(game);
    }

    public List<Name> getNames(Long gameId) {
        return gameRepository.findById(gameId).get().getNames();
    }
}
