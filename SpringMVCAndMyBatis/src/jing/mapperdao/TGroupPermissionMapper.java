package jing.mapperdao;

import java.util.List;
import jing.entity.TGroupPermission;
import jing.entity.TGroupPermissionExample;
import org.apache.ibatis.annotations.Param;

public interface TGroupPermissionMapper {
    int countByExample(TGroupPermissionExample example);

    int deleteByExample(TGroupPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TGroupPermission record);

    int insertSelective(TGroupPermission record);

    List<TGroupPermission> selectByExample(TGroupPermissionExample example);

    TGroupPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TGroupPermission record, @Param("example") TGroupPermissionExample example);

    int updateByExample(@Param("record") TGroupPermission record, @Param("example") TGroupPermissionExample example);

    int updateByPrimaryKeySelective(TGroupPermission record);

    int updateByPrimaryKey(TGroupPermission record);
}