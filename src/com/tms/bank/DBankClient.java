package com.tms.bank;

import com.tms.bank.BankClient;

public class DBankClient extends BankClient {

    @Override
    void checkPassportNumber() {
        System.out.println("Проверка номера паспорта метдом дейче банка");
    }

    @Override
    void checkCardNumber() {
        System.out.println("Проверка номера карты методом дойче банка");
    }
}
