package com.JohannesGroup.Programmieren.Monopoli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/Bank")
public class BankController {

    @GetMapping()
    public List<BankEntity> getBankEntity () {
        return List.of(
                new BankEntity(
                        1L,
                        "Bundesbank Kay"
                )
        );
    }
}
