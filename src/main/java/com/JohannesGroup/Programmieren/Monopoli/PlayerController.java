package com.JohannesGroup.Programmieren.Monopoli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;
    @GetMapping("/players")
    public List<PlayerEntity> getAllPlayers() {
        List<PlayerEntity> allPlayers = new ArrayList<>();
        Iterable<PlayerEntity> iterable = playerRepository.findAll();
        for(PlayerEntity playerEntity : iterable) {
            allPlayers.add(playerEntity);
        }
        return allPlayers;
    }

}
