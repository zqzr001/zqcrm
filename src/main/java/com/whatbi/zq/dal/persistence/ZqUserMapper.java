package com.whatbi.zq.dal.persistence;

import com.whatbi.zq.dal.domain.ZqUser;
import com.whatbi.zq.dal.domain.ZqUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZqUserMapper {
    /**
     * 获取符合条件的记录数
     * @param example 查询条件对象
     * @return 记录数
     */
    int countByExample(ZqUserExample example);

    /**
     * 批量删除符合条件的记录
     * @param example 查询条件对象
     * @return 成功删除的数量
     */
    int deleteByExample(ZqUserExample example);

    /**
     * 根据主键删除
     * @param id 主键值
     */
    int deleteByPrimaryKey(ZqUser record);

    /**
     * 新增记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待新增的对象
     */
    int insertSelective(ZqUser record);

    /**
     * 批量查询
     * @param example 查询条件对象
     */
    List<ZqUser> selectByExample(ZqUserExample example);

    /**
     * 根据主键查询
     * @param id 主键值
     */
    ZqUser selectByPrimaryKey(Long id);

    /**
     * 指量更新,将符合条件的记录统一更新为record的值 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待更新到数据库的值
     * @param example 查询条件对象
     * @return 成功操作的记录数
     */
    int updateByExampleSelective(@Param("record") ZqUser record, @Param("example") ZqUserExample example);

    /**
     * 指量更新,将符合条件的记录统一更新为record的值 
     * @param record 待更新到数据库的值
     * @param example 查询条件对象
     * @return 成功操作的记录数
     */
    int updateByExample(@Param("record") ZqUser record, @Param("example") ZqUserExample example);

    /**
     * 根据主键更新记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 记录
     */
    int updateByPrimaryKeySelective(ZqUser record);
}