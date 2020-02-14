package com.zhy.service.impl;

import com.zhy.dao.AccountDao;
import com.zhy.dao.impl.AccountDaoImpl;
import com.zhy.factory.BeanFactory;
import com.zhy.service.AccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao =new AccountDaoImpl();
    //private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.age=age;
        this.name=name;
        this.birthday=birthday;
    }
    //private
    public void saveAccount() {
        System.out.println("you succ:"+name+age+birthday);
        accountDao.saveAccount();
    }


}
