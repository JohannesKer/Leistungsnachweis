package com.JohannesGroup.Programmieren.Monopoli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    @GetMapping()
    public List<PlayerEntity> getPlayerEntity () {
        return List.of(
                new PlayerEntity(
                        1L, "Johannes"
                )
        );
    }

}
