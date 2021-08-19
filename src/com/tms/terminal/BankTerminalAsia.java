package com.tms.terminal;

import com.tms.bank.BankClient;
import com.tms.terminal.BankTerminal;

public class BankTerminalAsia extends BankTerminal implements IBankClientChecker {
    @Override
    public void registerNewClient(BankClient myClient) {
        System.out.println("Регистрация клиента в доменет Азия");
    }

    @Override
    public boolean registerNewClientByPassportNumber(String passportNumber) {
        System.out.println("Регистрация по паспотру в домене Азия");
        return true;
    }

    void customTerminalMethod(){
        System.out.println("Какой-то кастомный класс");
    }
}
