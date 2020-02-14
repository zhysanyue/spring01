package com.zhy.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    //定义一个properties对象
    private static Properties prop;

    //定义一个map，用于存放我们要创建的对象，称之为容器
    private static Map<String,Object> beans;
    //使用静态代码块为properties对象赋值
    static {
        //实例化对象
        prop=new Properties();
        //实例化容器对象
        beans=new HashMap<String, Object>();
        //获取properties文件的流对象
        InputStream in=BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化失败");
        }
        //取出配置文件中的所有类型
        Enumeration keys=prop.keys();
        //遍历枚举
        while (keys.hasMoreElements()){
            //取出每个key
            String key=keys.nextElement().toString();
            String beanPath=prop.getProperty(key);
            //反射创建对象
            try {
                Object value=Class.forName(beanPath).newInstance();
                beans.put(key,value);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            //把key和value存入容器之中
            //
        }


    }

    /**
     * 根据bean的名称获取bean对象
     * @param beanName
     * @return
     */
    /*public static Object getBean(String beanName){
        Object bean=null;
        String BeanPath =prop.getProperty(beanName);
        try {
            bean=Class.forName(BeanPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bean;
    }*/

    /**
     * 根据beankey获取对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
