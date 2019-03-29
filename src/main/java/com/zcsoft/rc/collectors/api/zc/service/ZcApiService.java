package com.zcsoft.rc.collectors.api.zc.service;


import com.sharingif.cube.core.handler.bind.annotation.RequestMapping;
import com.sharingif.cube.core.handler.bind.annotation.RequestMethod;
import com.zcsoft.rc.collectors.api.zc.entity.ZcReq;

@RequestMapping(value="mnemonic")
public interface ZcApiService {

    /**
     * 施工人员数据收集
     * @param req
     */
    @RequestMapping(value="collectBuilder", method= RequestMethod.POST)
    void collectBuilder(ZcReq req);

    /**
     * 司机数据收集
     * @param req
     */
    @RequestMapping(value="collectDriver", method= RequestMethod.POST)
    void collectDriver(ZcReq req);

}
