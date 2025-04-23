package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDtp Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber Input Mobile Number
     * @return object of CustomerDto
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - input customerDto
     * @return boolean indicating if the update of accountDetails is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber Input Mobile Number
     * @return boolean Indicating if the delete of account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);




}
