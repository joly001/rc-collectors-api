package com.zcsoft.rc.collectors.api.warning.service;

import com.sharingif.cube.core.handler.bind.annotation.RequestMapping;
import com.sharingif.cube.core.handler.bind.annotation.RequestMethod;
import com.zcsoft.rc.collectors.api.warning.entity.WarningCollectReq;

@RequestMapping(value="warning")
public interface WarningApiService {

    /**
     * 数据收集
     */
    @RequestMapping(value="collect", method= RequestMethod.POST)
    void collect(WarningCollectReq req);

}
