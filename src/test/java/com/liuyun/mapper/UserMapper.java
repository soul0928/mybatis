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
