package info.venkat.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Component
public class TransactionEntity {

    @Id
    Long pk;

    @Column
    String transactionId;

    @Column(nullable = false)
    String userId;

    @Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date transactionDate;

    @Column(nullable = false)
    Float transactionAmount;

    public TransactionEntity(String transactionId, String userId, Date transactionDate, Float transactionAmount) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public TransactionEntity(String userId, Date transactionDate, Float transactionAmount) {
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public TransactionEntity() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public TransactionEntity setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public TransactionEntity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public TransactionEntity setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public Float getTransactionAmount() {
        return transactionAmount;
    }

    public TransactionEntity setTransactionAmount(Float transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
}
