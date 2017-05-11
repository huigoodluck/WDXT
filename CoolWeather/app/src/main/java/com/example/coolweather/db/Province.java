package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 54459 on 2017/5/11 0011.
 */

public class Province extends DataSupport {

    private int id;                     //当前省的id

    private String provinceName;       //当前省的名字

    private int provinceCode;          //当前省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
