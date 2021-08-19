package com.tms.bank;

public abstract class BankClient {

    public String clientName;
    String passportNumber;
    double income;
    String cardNumber;

    abstract void checkPassportNumber();

    abstract void checkCardNumber();

    void getClientInfo(){
        System.out.println("Вот вам вся инфа о клиенте");
    }

}