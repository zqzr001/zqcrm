package com.whatbi.zq.dal.persistence;

import com.whatbi.zq.dal.domain.ZqDebtTransfer;
import com.whatbi.zq.dal.domain.ZqDebtTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZqDebtTransferMapper {
    /**
     * 获取符合条件的记录数
     * @param example 查询条件对象
     * @return 记录数
     */
    int countByExample(ZqDebtTransferExample example);

    /**
     * 批量删除符合条件的记录
     * @param example 查询条件对象
     * @return 成功删除的数量
     */
    int deleteByExample(ZqDebtTransferExample example);

    /**
     * 根据主键删除
     * @param id 主键值
     */
    int deleteByPrimaryKey(ZqDebtTransfer record);

    /**
     * 新增记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待新增的对象
     */
    int insertSelective(ZqDebtTransfer record);

    /**
     * 批量查询
     * @param example 查询条件对象
     */
    List<ZqDebtTransfer> selectByExample(ZqDebtTransferExample example);

    /**
     * 根据主键查询
     * @param id 主键值
     */
    ZqDebtTransfer selectByPrimaryKey(Long id);

    /**
     * 指量更新,将符合条件的记录统一更新为record的值 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待更新到数据库的值
     * @param example 查询条件对象
     * @return 成功操作的记录数
     */
    int updateByExampleSelective(@Param("record") ZqDebtTransfer record, @Param("example") ZqDebtTransferExample example);

    /**
     * 指量更新,将符合条件的记录统一更新为record的值 
     * @param record 待更新到数据库的值
     * @param example 查询条件对象
     * @return 成功操作的记录数
     */
    int updateByExample(@Param("record") ZqDebtTransfer record, @Param("example") ZqDebtTransferExample example);

    /**
     * 根据主键更新记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 记录
     */
    int updateByPrimaryKeySelective(ZqDebtTransfer record);
}