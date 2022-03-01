package cn.wang;


import cn.wang.mapper.StudentMapper;
import cn.wang.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.io.InputStream;

public class MyTest {
private static SqlSessionFactory factory;
private StudentMapper studentMapper ;
static {
    try {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @Test
    public  void  testInsert(){
        SqlSession session = factory.openSession();
        studentMapper  = session.getMapper(StudentMapper.class);
        Student student = studentMapper.selectByPrimaryKey(20);
        System.out.println(student);
        session.commit();
        session.close();
    }
}
