package com.liuyun.mapper;

import com.liuyun.pojo.UserEntity;

import java.util.List;

/**
 * @ProjectName mybatis
 * @ClassName UserrMapper
 * @Description
 * @Author WangDong
 * @Date 2019/9/18 15:55
 * @Version 2.1.3
 **/
public interface UserMapper {

  List<UserEntity> queryAll();

}
