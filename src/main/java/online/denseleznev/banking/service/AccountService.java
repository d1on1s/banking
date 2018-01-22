package online.denseleznev.banking.service;

import online.denseleznev.banking.domain.PrimaryAccount;
import online.denseleznev.banking.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
