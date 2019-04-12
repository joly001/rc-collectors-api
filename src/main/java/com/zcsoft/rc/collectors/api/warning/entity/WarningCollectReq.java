package com.zcsoft.rc.collectors.api.warning.entity;

public class WarningCollectReq {

    /**
     * id
     */
    private String id;
    /**
     * 警告信息
     */
    private String warning;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WarningCollectReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", warning='").append(warning).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
