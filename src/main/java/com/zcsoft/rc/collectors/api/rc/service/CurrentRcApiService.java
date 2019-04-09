package com.zcsoft.rc.collectors.api.rc.service;


import com.sharingif.cube.core.handler.bind.annotation.RequestMapping;
import com.sharingif.cube.core.handler.bind.annotation.RequestMethod;
import com.zcsoft.rc.collectors.api.rc.entity.CurrentRcMapRsp;

@RequestMapping(value="currentRc")
public interface CurrentRcApiService {

    /**
     * 返回当前rc信息
     */
    @RequestMapping(value="all", method= RequestMethod.POST)
    CurrentRcMapRsp all();

}
