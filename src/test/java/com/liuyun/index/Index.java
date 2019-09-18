package com.liuyun.index;

import com.liuyun.mapper.UserMapper;
import com.liuyun.pojo.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ProjectName mybatis
 * @ClassName Index
 * @Description
 * @Author WangDong
 * @Date 2019/9/18 16:23
 * @Version 2.1.3
 **/
@Slf4j
public class Index {

  private static final String RESOURCES = "mybatis.xml";

  public static void main(String[] args) {
    try {
      InputStream resourceAsStream = Resources.getResourceAsStream(RESOURCES);
      SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
      SqlSession sqlSession = build.openSession();

      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      List<UserEntity> users = mapper.queryAll();
      System.out.println(users);
      sqlSession.close();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
