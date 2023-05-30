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

    @PostMapping("/transactions")
    @Transactional
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
        TransactionEntity  transactionEntity = new TransactionEntity();
        transactionEntity.setBank(optionalBankEntity.get());
        transactionEntity.setAmount(transactionDto.getAmount());
        PlayerEntity recipient = optionalRecipient.get();
        transactionEntity.setRecipient(optionalRecipient.get());
        PlayerEntity sender = optionalSender.get();
        transactionEntity.setSender(sender);
        recipient.getAccount().addAmountToBalance(transactionDto.getAmount());
        sender.getAccount().subtractAmountFromBalance(transactionDto.getAmount());
        return   transactionRepository.save(transactionEntity);

    }
}
