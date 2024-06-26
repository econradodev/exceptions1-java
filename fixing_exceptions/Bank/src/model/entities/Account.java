package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number; //numero da conta
    private String holder; //titular
    private Double balance; // saldo
    private Double withdrawLimit; //limite de saque

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit (Double amount) {
        this.balance += amount;
    }

    public void withdraw (Double amount) throws DomainException {
        this.balance -= amount;
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new DomainException("Not enough balance");
        }
    }
}
