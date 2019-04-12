package com.zcsoft.rc.collectors.api.warning.service;

import com.sharingif.cube.core.handler.bind.annotation.RequestMapping;
import com.sharingif.cube.core.handler.bind.annotation.RequestMethod;
import com.zcsoft.rc.collectors.api.warning.entity.WarningCollectReq;
import com.zcsoft.rc.collectors.api.warning.entity.WarningDeleteReq;

@RequestMapping(value="warning")
public interface WarningApiService {

    /**
     * 数据收集
     */
    @RequestMapping(value="collect", method= RequestMethod.POST)
    void collect(WarningCollectReq req);

    /**
     * 警告信息删除
     */
    @RequestMapping(value="delete", method= RequestMethod.POST)
    void delete(WarningDeleteReq req);

}
