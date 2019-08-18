package info.venkat.service;

import info.venkat.model.TransactionEntity;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    TransactionEntity addTransaction(TransactionEntity myTransactionEntity);
    Optional<TransactionEntity> getTransaction(String TransactionEntityId);
    List<TransactionEntity> getAllTransactions();
    void deleteTransaction(String TransactionEntityId);
    TransactionEntity updateTransaction(TransactionEntity myTransactionEntity);
    TransactionEntity createDefaultTransaction();
}
