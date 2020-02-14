package com.zhy.ui;

import com.zhy.dao.AccountDao;
import com.zhy.factory.BeanFactory;
import com.zhy.service.AccountService;
import com.zhy.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 */
public class Client {
    /**
     * properties的获取方法
     */
//    public static void main(String[] args) {
//       AccountService service=new AccountServiceImpl();
//        //AccountService service=(AccountService) BeanFactory.getBean("accountService");
//
//    }

    /**
     * 获取spring的ioc方法,并根据id获取对象
     */

    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        //AccountService service=(AccountService)ac.getBean("accountService");
        AccountService service=(AccountService)ac.getBean("accountService3");
//        AccountDao accountDao=ac.getBean("accountDao",AccountDao.class);
//        System.out.println(service);
//        System.out.println(accountDao);
        service.saveAccount();
        ac.close();

    }
}
