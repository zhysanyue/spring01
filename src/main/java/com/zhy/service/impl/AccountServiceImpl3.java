package com.zhy.service.impl;

import com.zhy.dao.AccountDao;
import com.zhy.dao.impl.AccountDaoImpl;
import com.zhy.service.AccountService;

import java.util.*;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl3 implements AccountService {

    private AccountDao accountDao =new AccountDaoImpl();
    //private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    private String[] myStr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProp;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProp(Properties myProp) {
        this.myProp = myProp;
    }

    //private
    public void saveAccount() {
        System.out.println(Arrays.toString(myStr));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProp);
        accountDao.saveAccount();
    }


}
