package com.njwb.zijin.dao;

import com.njwb.zijin.entity.Dept;
import java.util.List; // 这是必需的导入，以支持 List 类型
import org.apache.ibatis.annotations.Select

public interface DeptMapper {
    // 删除重复的方法声明
    @Select("select name from emp where empid=#{id}")
    fun selectAllDept(): List<Dept>
}
