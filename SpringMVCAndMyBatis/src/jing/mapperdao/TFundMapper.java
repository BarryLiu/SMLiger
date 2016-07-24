package jing.mapperdao;

import java.util.List;
import jing.entity.TFund;
import jing.entity.TFundExample;
import org.apache.ibatis.annotations.Param;

public interface TFundMapper {
    int countByExample(TFundExample example);

    int deleteByExample(TFundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFund record);

    int insertSelective(TFund record);

    List<TFund> selectByExample(TFundExample example);

    TFund selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFund record, @Param("example") TFundExample example);

    int updateByExample(@Param("record") TFund record, @Param("example") TFundExample example);

    int updateByPrimaryKeySelective(TFund record);

    int updateByPrimaryKey(TFund record);
}