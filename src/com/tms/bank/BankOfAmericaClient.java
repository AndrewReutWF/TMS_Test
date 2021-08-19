package com.tms.bank;

import com.tms.bank.BankClient;

public class BankOfAmericaClient extends BankClient {

    String registrationAddress;

    @Override
    void checkPassportNumber() {
        System.out.println("Проверка номера паспорта метдом банк оф америка");
    }

    @Override
    void checkCardNumber() {
        System.out.println("Проверка номера карты методом банк оф америка");
    }
}
