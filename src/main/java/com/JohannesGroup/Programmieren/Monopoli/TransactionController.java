package com.JohannesGroup.Programmieren.Monopoli;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PlayerRepository playerRepository;

    // Änderung in Datenbank wird vorgenommen
    @PostMapping("/transactions")
    @Transactional      // Das TransactionDTO muss im http request body übermittelt werden ->  spring boot übersetzt von json nach java automatisch
    public TransactionEntity createTransaction(@RequestBody TransactionDto transactionDto) {
        Optional<BankEntity> optionalBankEntity = bankRepository.findById(transactionDto.getBankid());
        if(optionalBankEntity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find a bank with bankid = " + transactionDto.getBankid());
        }
        Optional<PlayerEntity> optionalSender = playerRepository.findById(transactionDto.getSenderid());
        if(optionalSender.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find a player with playerid = " + transactionDto.getSenderid());
        }
        Optional<PlayerEntity> optionalRecipient = playerRepository.findById(transactionDto.getRecipientid());
        if(optionalRecipient.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not find a recipient with recipientid = " + transactionDto.getRecipientid());
        }
        TransactionEntity  transactionEntity = new TransactionEntity(); // neue instanz wird erzeugt
        transactionEntity.setBank(optionalBankEntity.get());        // Bank wird gesetzt
        transactionEntity.setAmount(transactionDto.getAmount());        // betrag wird gesetzt
        PlayerEntity recipient = optionalRecipient.get();       // neue Instanz
        transactionEntity.setRecipient(optionalRecipient.get());
        PlayerEntity sender = optionalSender.get();
        transactionEntity.setSender(sender);
        recipient.getAccount().addAmountToBalance(transactionDto.getAmount());
        sender.getAccount().subtractAmountFromBalance(transactionDto.getAmount());
        return   transactionRepository.save(transactionEntity);

    }
}
