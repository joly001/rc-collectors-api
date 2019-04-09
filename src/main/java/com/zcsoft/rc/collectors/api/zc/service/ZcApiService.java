package com.zcsoft.rc.collectors.api.zc.service;


import com.sharingif.cube.core.handler.bind.annotation.RequestMapping;
import com.sharingif.cube.core.handler.bind.annotation.RequestMethod;
import com.zcsoft.rc.collectors.api.zc.entity.ZcReq;

@RequestMapping(value="zc")
public interface ZcApiService {

    /**
     * 数据收集
     */
    @RequestMapping(value="collect", method= RequestMethod.POST)
    void collect(ZcReq req);

}
