package info.venkat.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Component
public class DashboardEntity {

    @Id
    String dashboardId;

    @Column(nullable = false)
    String userId;

    @Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date transactionDate;

    @Column
    Float amountValue1;

    @Column
    Float amountValue2;

    @Column
    Float amountValue3;

    @Column
    Float amountValue4;

    public DashboardEntity() {
    }

    public DashboardEntity(String userId, Date transactionDate, Float amountValue1, Float amountValue2, Float amountValue3, Float amountValue4) {
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.amountValue1 = amountValue1;
        this.amountValue2 = amountValue2;
        this.amountValue3 = amountValue3;
        this.amountValue4 = amountValue4;
    }

    public String getDashboardId() {
        return dashboardId;
    }

    public DashboardEntity setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public DashboardEntity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public DashboardEntity setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public Float getAmountValue1() {
        return amountValue1;
    }

    public DashboardEntity setAmountValue1(Float amountValue1) {
        this.amountValue1 = amountValue1;
        return this;
    }

    public Float getAmountValue2() {
        return amountValue2;
    }

    public DashboardEntity setAmountValue2(Float amountValue2) {
        this.amountValue2 = amountValue2;
        return this;
    }

    public Float getAmountValue3() {
        return amountValue3;
    }

    public DashboardEntity setAmountValue3(Float amountValue3) {
        this.amountValue3 = amountValue3;
        return this;
    }

    public Float getAmountValue4() {
        return amountValue4;
    }

    public DashboardEntity setAmountValue4(Float amountValue4) {
        this.amountValue4 = amountValue4;
        return this;
    }
}
