package cn.itedus.lottery.test.vo2dto;

import cn.itedus.lottery.test.vo2dto.ccc.User;

/**
 * @description: 继承对象转换
 *
 * @date: 2022/1/16
 *
 *
 */
public class ApiTest04 {

    public void test_vo2dto(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserNickName(user.getUserNickName());
        userDTO.setUserHead(user.getUserHead());
        userDTO.setPage(user.getPage());
        userDTO.setRows(user.getRows());


    }

}
