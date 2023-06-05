package com.JohannesGroup.Programmieren.Monopoli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController                    // Localhost -> Klasse kann geprüft werden
public class PlayerController {
    @Autowired                              // Erzeugt automatisch eine Instanz
    private PlayerRepository playerRepository;
    @GetMapping("/players")
    public List<PlayerEntity> getAllPlayers() {
        List<PlayerEntity> allPlayers = new ArrayList<>();      // erstellt Liste
        Iterable<PlayerEntity> iterable = playerRepository.findAll();       //Iterable wird alle player zugewiesen
        for(PlayerEntity playerEntity : iterable) {     // iteriert durch Player
            allPlayers.add(playerEntity);
        }
        return allPlayers;      // wandelt Liste in JSONarray um
    }

}
