package cn.zrz.service.impl;

import cn.zrz.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    public String getProduct(Integer id) {
        return "产品" + id;
    }
}
