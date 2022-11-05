package com.kang.pojo;

import java.util.List;

public class Accounts {
    private String aname;
    private int amount;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aname='" + aname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
