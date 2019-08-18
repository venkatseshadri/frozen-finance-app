package info.venkat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class TransactionEntity {

    @Id
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
