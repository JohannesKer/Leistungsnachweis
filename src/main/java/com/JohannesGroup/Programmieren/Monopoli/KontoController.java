package com.JohannesGroup.Programmieren.Monopoli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/Konto")
public class KontoController {
    @GetMapping()
    public List<KontoEntity> getKontoEntity() {
        return List.of(
                new KontoEntity(
                        1,
                        1000
                )
        );
    }
}
