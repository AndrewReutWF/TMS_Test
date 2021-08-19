package com.tms.bank;

import com.tms.bank.BankClient;

public class ChinaBankClient extends BankClient {

    int age;
    String registrationAddress;

    @Override
    void checkPassportNumber() {
        System.out.println("Проверка паспорта методом чайна банка");
    }

    @Override
    void checkCardNumber() {
        System.out.println("Проверка номера карты методом чайна банка");
    }
}
