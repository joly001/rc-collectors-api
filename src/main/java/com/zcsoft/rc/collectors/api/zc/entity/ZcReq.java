package com.zcsoft.rc.collectors.api.zc.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class ZcReq {

    /**
     * id
     */
    @NotEmpty
    private String id;
    /**
     * 类型
     */
    @NotEmpty
    private String type;
    /**
     * 经度
     */
    @NotNull
    private Double longitude;
    /**
     * 维度
     */
    @NotNull
    private Double latitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ZcReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append('}');
        return sb.toString();
    }
}
