package com.xxx.demo.models.sys;

/**
 * 远程寻车
 * @author guo.zj
 */
public class VehicleCtrl {
    private String type;
    private String vin;
    private String controltype;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }


    public String getControltype() {
        return controltype;
    }

    public void setControltype(String controltype) {
        this.controltype = controltype;
    }
}
