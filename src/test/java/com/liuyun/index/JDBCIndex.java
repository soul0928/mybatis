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

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ProjectName mybatis
 * @ClassName JDBCIndex
 * @Description
 * @Author WangDong
 * @Date 2019/9/18 15:57
 * @Version 2.1.3
 **/
public class JDBCIndex {

  static {
    try {
      // 加载驱动
      Class.forName(Driver.class.getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws Exception {
    Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8", "root", "root");
    PreparedStatement preparedStatement = root.prepareStatement("select * from t_user where id=?");
    preparedStatement.setString(1,"1");
    ResultSet resultSet = preparedStatement.executeQuery();
    while (resultSet.next()) {
      String columnName1 = resultSet.getMetaData().getColumnName(1);
      String columnName2 = resultSet.getMetaData().getColumnName(2);
      System.out.println(columnName1+":"+resultSet.getString(1));
      System.out.println(columnName2+":"+resultSet.getString(2));
    }
    resultSet.close();
    preparedStatement.close();
    root.close();

  }

}
