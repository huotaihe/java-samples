package com.github.huotaihe.sample.java.mapstruct;

import com.github.huotaihe.sample.java.mapstruct.pojo.UserDTO;
import com.github.huotaihe.sample.java.mapstruct.pojo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author 寒溪
 * @date 2021/09/09
 */
@Slf4j
public class UserConvertorTest {

    @Test
    public void testDto2Vo() {

        UserDTO userDTO = new UserDTO();
        userDTO.setName("Huo");
        userDTO.setAge(33);

        UserVO userVO = UserConvertor.INSTANCE.dto2vo(userDTO);

        log.info("UserVO: {}", userVO);

    }

}
