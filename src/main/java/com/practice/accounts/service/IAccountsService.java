package com.practice.accounts.service;

import com.practice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobilerNumber
     */
    CustomerDto fetchAccount(String mobileNumber);
}
