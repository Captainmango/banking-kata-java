package com.optivem.kata.banking.core.common;

import com.optivem.kata.banking.core.domain.accounts.BankAccountRepository;

public class Givens {
    public static BankAccountRepositoryGiven givenThatRepository(BankAccountRepository repository) {
        return new BankAccountRepositoryGiven(repository);
    }
}
