package com.njwb.zijin;

import com.njwb.zijin.entity.Dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class App2 {
    public static void main(String[] args){
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
                App.class.getClassLoader().getResourceAsStream("mybatisConf.xml"));
        //打开会话
        SqlSession ss = ssf.openSession();
        //查询返回一个对象
        Object obj = ss.selectOne("com.njwb.zijin.dao.DeptMapper.selectDeptById");
        System.out.println(obj);
        //查询返回List集合
        List<Dept> list = ss.selectList("com.njwb.zijin.dao.DeptMapper.selectAllDept");
        for (Dept dept : list) {
            System.out.println(dept);
        }
//        关闭会话
        ss.close();

    }
}
