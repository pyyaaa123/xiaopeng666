package com.njwb.zijin;

import com.njwb.zijin.entity.Dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.swing.text.Style;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App3 {
//    public static void main(String[] args){
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
//                App.class.getClassLoader().getResourceAsStream("mybatisConf.xml"));
//        //打开会话
//        SqlSession ss = ssf.openSession();
//        //添加一个部门
////        int result = ss.insert("com.njwb.zijin.entity.DeptMapper.addDept1",6);
////        System.out.println(result);
////        Dept dept = new Dept(6,"xiao","ling");
////        int result = ss.insert("com.njwb.zijin.dao.DeptMapper.addDept1",dept);
////        System.out.println("Insert result: "+result);
////        ss.commit();
//        //添加
//        //查询2号部门职位是zuzhang的员工
////        Map<String,Object> map = new HashMap<>();
////        map.put("name", "Bob");
////        map.put("deptid", 2);
////        Object obj = ss.selectOne("com.njwb.zijin.dao.DeptMapper.selectEmp", map);
////        System.out.println(obj);
//        Map<String,Object> map = new HashMap<>();
//        map.put("a", "name");
//        map.put("b", "der");
//        map.put("c", "dept");
//        map.put("d", "Bob");
//        map.put("e", "where");
//
//        Dept obj = ss.selectOne("com.njwb.zijin.dao.DeptMapper.test", map);
//        System.out.println(obj);
//
//
//
////        关闭会话
//        ss.close();
//
//    }
}
