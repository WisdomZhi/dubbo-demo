package cn.zrz.service.impl;

import cn.zrz.service.ConsumerService;
import cn.zrz.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ProviderService providerService;

    public void buyProduct(Integer productId) {
        String product = providerService.getProduct(productId);
        System.out.println("已购买到：" + product);
    }
}
