package test1;

import com.dao.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-10-09  10:58
 * @Description: TODO
 * @Version: 1.0
 */
public class test1 {
    @Test
    public void getUserById () throws IOException {
        String resource="MybatisConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        User o = sqlSession.selectOne("dao.userMapper.findIdUser", 1);
        System.out.println(o.toString());
        sqlSession.close();
    }
}
