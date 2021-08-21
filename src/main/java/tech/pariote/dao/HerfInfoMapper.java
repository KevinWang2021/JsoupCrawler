package tech.pariote.dao;

import tech.pariote.bean.HerfInfo;

import java.io.IOException;
import java.util.List;

public interface HerfInfoMapper {
    /**
     *  根据pageid查询链接信息
     *
     *
     * @param sourcePageID
     * @return
     * @throws IOException
     */
    List<HerfInfo> getHerfInfo(int sourcePageID)throws IOException;

}
