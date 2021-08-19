package com.tms.terminal;

import com.tms.bank.BankClient;

public interface IBankClientChecker {

    void registerNewClient(BankClient myClient);

    boolean registerNewClientByPassportNumber(String passportNumber);

}
