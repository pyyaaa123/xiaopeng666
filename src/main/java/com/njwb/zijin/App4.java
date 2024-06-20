package com.njwb.zijin;

import com.njwb.zijin.dao.DeptMapper;
import com.njwb.zijin.entity.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App4 {
    public static void main(String[] args){
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            try (SqlSession session = sqlSessionFactory.openSession()) {
                DeptMapper mapper = session.getMapper(DeptMapper.class);
                List<Dept> depts = mapper.selectAllDept();
                depts.forEach(dept -> System.out.println(dept.getName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
