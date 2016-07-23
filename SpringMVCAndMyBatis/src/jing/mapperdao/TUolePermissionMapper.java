package jing.mapperdao;

import java.util.List;
import jing.entity.TUolePermission;
import jing.entity.TUolePermissionExample;
import org.apache.ibatis.annotations.Param;

public interface TUolePermissionMapper {
    int countByExample(TUolePermissionExample example);

    int deleteByExample(TUolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUolePermission record);

    int insertSelective(TUolePermission record);

    List<TUolePermission> selectByExample(TUolePermissionExample example);

    TUolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUolePermission record, @Param("example") TUolePermissionExample example);

    int updateByExample(@Param("record") TUolePermission record, @Param("example") TUolePermissionExample example);

    int updateByPrimaryKeySelective(TUolePermission record);

    int updateByPrimaryKey(TUolePermission record);
}