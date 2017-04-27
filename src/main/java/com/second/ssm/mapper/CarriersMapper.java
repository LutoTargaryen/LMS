package com.second.ssm.mapper;

import com.second.ssm.pojo.Carriers;
import com.second.ssm.pojo.CarriersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarriersMapper {
    int countByExample(CarriersExample example);

    int deleteByExample(CarriersExample example);

    int deleteByPrimaryKey(Integer carriersid);

    int insert(Carriers record);

    int insertSelective(Carriers record);

    List<Carriers> selectByExample(CarriersExample example);

    Carriers selectByPrimaryKey(Integer carriersid);

    int updateByExampleSelective(@Param("record") Carriers record, @Param("example") CarriersExample example);

    int updateByExample(@Param("record") Carriers record, @Param("example") CarriersExample example);

    int updateByPrimaryKeySelective(Carriers record);

    int updateByPrimaryKey(Carriers record);
}