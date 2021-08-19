package com.tms.terminal;

import com.tms.bank.BankClient;
import com.tms.terminal.BankTerminal;

public class BankTerminalEurope extends BankTerminal implements IBankClientChecker {
    @Override
    public void registerNewClient(BankClient myClient) {
        System.out.println("Регистрация клиента в доменет Европа");
    }

    @Override
    public boolean registerNewClientByPassportNumber(String passportNumber) {
        System.out.println("Регистрация по паспотру в домене Европа");
        return true;
    }
}
