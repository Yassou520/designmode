package com.ddd.designmode.cglibproxy;

public class Rider {
    private String name;

    public Rider(String name) {
        this.name = name;
    }
    public void fight(){
        System.out.println(name+" 战斗");
    }
}
