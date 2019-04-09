package com.zcsoft.rc.collectors.api.rc.entity;

import java.util.Map;

public class CurrentRcMapRsp {

    private Map<String,CurrentRcRsp> rcMap;

    public Map<String, CurrentRcRsp> getRcMap() {
        return rcMap;
    }

    public void setRcMap(Map<String, CurrentRcRsp> rcMap) {
        this.rcMap = rcMap;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrentRcRsp{");
        sb.append("rcMap=").append(rcMap);
        sb.append('}');
        return sb.toString();
    }
}
