package info.venkat.service.impl;

import info.venkat.model.TransactionEntity;
import info.venkat.repository.TransactionRepository;
import info.venkat.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository TransactionRepository;

    public TransactionEntity addTransaction(TransactionEntity myTransaction) {
        return TransactionRepository.save(myTransaction);
    }

    public Optional<TransactionEntity> getTransaction(String TransactionId) {
        return TransactionRepository.findById(TransactionId);
    }

    public List<TransactionEntity> getAllTransactions() {
        List<TransactionEntity> Transactions = new ArrayList<>();
        TransactionRepository.findAll().forEach(Transactions::add);
        return Transactions;
    }

    public void deleteTransaction(String TransactionId) {
        TransactionRepository.deleteById(TransactionId);
    }

    public TransactionEntity updateTransaction(TransactionEntity myTransaction) {
        return TransactionRepository.save(myTransaction);
    }

    @Override
    public TransactionEntity createDefaultTransaction() {
        TransactionEntity newDefaultTransaction = new TransactionEntity("TransactionId1","jdoe",new java.util.Date(),0.0f);
        return addTransaction(newDefaultTransaction);
    }
}
