package com.ddd.designmode;

import com.ddd.designmode.cglibproxy.ProxyFactory;
import com.ddd.designmode.cglibproxy.Rider;

public class Main {
    public static void main(String[] args) {
        Rider rider = new Rider("龙骑");
        ProxyFactory proxyFactory = new ProxyFactory(rider);
        Rider instance = (Rider) proxyFactory.getProxyInstance();
        instance.fight();
    }
}