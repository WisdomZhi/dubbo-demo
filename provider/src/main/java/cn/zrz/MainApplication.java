package cn.zrz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) throws Exception  {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("classpath:application.xml");
        context.start();
        System.in.read();   //阻塞方法的结束
    }
}
