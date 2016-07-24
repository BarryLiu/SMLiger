package jing.mapperdao;

import java.util.List;
import jing.entity.TFundType;
import jing.entity.TFundTypeExample;
import org.apache.ibatis.annotations.Param;

public interface TFundTypeMapper {
    int countByExample(TFundTypeExample example);

    int deleteByExample(TFundTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFundType record);

    int insertSelective(TFundType record);

    List<TFundType> selectByExample(TFundTypeExample example);

    TFundType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFundType record, @Param("example") TFundTypeExample example);

    int updateByExample(@Param("record") TFundType record, @Param("example") TFundTypeExample example);

    int updateByPrimaryKeySelective(TFundType record);

    int updateByPrimaryKey(TFundType record);
}