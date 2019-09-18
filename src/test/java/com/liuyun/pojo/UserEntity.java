package com.liuyun.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @ProjectName mybatis
 * @ClassName UserEntity
 * @Description
 * @Author WangDong
 * @Date 2019/9/18 18:51
 * @Version 2.1.3
 **/
@Data
@Alias("UserEntity")
public class UserEntity {

  private Integer id;

  private String name;

}
