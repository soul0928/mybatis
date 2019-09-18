/**
 *    Copyright 2009-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
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
