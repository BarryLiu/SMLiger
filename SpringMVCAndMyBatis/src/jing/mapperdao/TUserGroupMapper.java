package jing.mapperdao;

import java.util.List;
import jing.entity.TUserGroup;
import jing.entity.TUserGroupExample;
import org.apache.ibatis.annotations.Param;

public interface TUserGroupMapper {
    int countByExample(TUserGroupExample example);

    int deleteByExample(TUserGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserGroup record);

    int insertSelective(TUserGroup record);

    List<TUserGroup> selectByExample(TUserGroupExample example);

    TUserGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserGroup record, @Param("example") TUserGroupExample example);

    int updateByExample(@Param("record") TUserGroup record, @Param("example") TUserGroupExample example);

    int updateByPrimaryKeySelective(TUserGroup record);

    int updateByPrimaryKey(TUserGroup record);
}