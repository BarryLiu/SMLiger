package jing.mapperdao;

import java.util.List;
import jing.entity.TUserRefill;
import jing.entity.TUserRefillExample;
import org.apache.ibatis.annotations.Param;

public interface TUserRefillMapper {
    int countByExample(TUserRefillExample example);

    int deleteByExample(TUserRefillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserRefill record);

    int insertSelective(TUserRefill record);

    List<TUserRefill> selectByExample(TUserRefillExample example);

    TUserRefill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserRefill record, @Param("example") TUserRefillExample example);

    int updateByExample(@Param("record") TUserRefill record, @Param("example") TUserRefillExample example);

    int updateByPrimaryKeySelective(TUserRefill record);

    int updateByPrimaryKey(TUserRefill record);
}