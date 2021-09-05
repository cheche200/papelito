package com.juanicheche.papelito.controller;


import com.juanicheche.papelito.domain.Game;
import com.juanicheche.papelito.domain.Name;
import com.juanicheche.papelito.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/papelito")
public class GameController {

    private final GameService gameService;

    @PostMapping("/createGame")
    @ResponseStatus(HttpStatus.CREATED)
    public HttpEntity<Game> createGame(@RequestBody Game game){
        gameService.saveGame(game);
        return new HttpEntity<>(game);
    }

    @GetMapping("/getNames/{gameId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Name> getNames(@PathVariable Long gameId){
        return gameService.getNames(gameId);
    }

    @GetMapping("/getTimer")
    public String getTimer(){
        return "timer";
    }

}
