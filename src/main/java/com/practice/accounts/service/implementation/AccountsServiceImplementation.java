package com.practice.accounts.service.implementation;

import com.practice.accounts.dto.CustomerDto;
import com.practice.accounts.repository.AccountsRepository;
import com.practice.accounts.repository.CustomerRepository;
import com.practice.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImplementation implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {


    }
}
