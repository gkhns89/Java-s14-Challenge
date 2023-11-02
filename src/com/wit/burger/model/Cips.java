package com.wit.burger.model;

import com.wit.burger.enums.CipsType;

public class Cips {

    private CipsType cipsType;

    public Cips(CipsType cipsType) {
        this.cipsType = cipsType;
    }

    public CipsType getCipsType() {
        return cipsType;
    }
}
