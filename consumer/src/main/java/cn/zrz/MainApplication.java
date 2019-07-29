package cn.zrz;

import cn.zrz.service.ConsumerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        context.start();
        ConsumerService consumerService = context.getBean(ConsumerService.class);
        consumerService.buyProduct(1);

        System.in.read();   //这里同样阻塞一下方法，方便通过dubbo-admin看到消费者的信息
    }
}
