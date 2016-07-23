package jing.mapperdao;

import java.util.List;
import jing.entity.TUserPermission;
import jing.entity.TUserPermissionExample;
import org.apache.ibatis.annotations.Param;

public interface TUserPermissionMapper {
    int countByExample(TUserPermissionExample example);

    int deleteByExample(TUserPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserPermission record);

    int insertSelective(TUserPermission record);

    List<TUserPermission> selectByExample(TUserPermissionExample example);

    TUserPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserPermission record, @Param("example") TUserPermissionExample example);

    int updateByExample(@Param("record") TUserPermission record, @Param("example") TUserPermissionExample example);

    int updateByPrimaryKeySelective(TUserPermission record);

    int updateByPrimaryKey(TUserPermission record);
}