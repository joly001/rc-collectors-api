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
    @RequestMapping(value="collectCordon", method= RequestMethod.POST)
    void collectCordon(WarningCollectReq req);

    /**
     * 警告信息删除
     */
    @RequestMapping(value="deleteCordon", method= RequestMethod.POST)
    void deleteCordon(WarningDeleteReq req);

    /**
     * 警告信息收集列车临站警告
     */
    @RequestMapping(value="collectTemporaryStation", method= RequestMethod.POST)
    void collectTemporaryStation(WarningCollectReq req);

    /**
     * 警告信息删除列车临站警告
     */
    @RequestMapping(value="deleteTemporaryStation", method= RequestMethod.POST)
    void deleteTemporaryStation(WarningDeleteReq req);

    /**
     * 警告信息收集列车接近警告
     */
    @RequestMapping(value="collectTrainApproaching", method= RequestMethod.POST)
    void collectTrainApproaching(WarningCollectReq req);

    /**
     * 警告信息删除列车接近警告
     */
    @RequestMapping(value="deleteTrainApproaching", method= RequestMethod.POST)
    void deleteTrainApproaching(WarningDeleteReq req);

}
