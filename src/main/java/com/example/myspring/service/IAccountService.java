package com.example.myspring.service;

import com.example.myspring.entity.Account;

import java.util.List;

/**
 * Created by Bruce on 2017/11/22.
 */
public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
