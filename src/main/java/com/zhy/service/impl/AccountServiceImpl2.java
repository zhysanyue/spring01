package com.zhy.service.impl;

import com.zhy.dao.AccountDao;
import com.zhy.dao.impl.AccountDaoImpl;
import com.zhy.factory.BeanFactory;
import com.zhy.service.AccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl2 implements AccountService {

    private AccountDao accountDao =new AccountDaoImpl();
    //private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //private
    public void saveAccount() {
        System.out.println("you succ:"+name+age+birthday);
        accountDao.saveAccount();
    }


}
