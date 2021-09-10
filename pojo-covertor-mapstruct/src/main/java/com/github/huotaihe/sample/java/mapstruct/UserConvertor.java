package com.github.huotaihe.sample.java.mapstruct;

import com.github.huotaihe.sample.java.mapstruct.pojo.UserDTO;
import com.github.huotaihe.sample.java.mapstruct.pojo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author 寒溪
 * @date 2021/09/09
 */
@Mapper
public interface UserConvertor {

    UserConvertor INSTANCE = Mappers.getMapper(UserConvertor.class);

    //@Mapping(target = "name", source = "name")
    UserVO dto2vo(UserDTO user);

}
