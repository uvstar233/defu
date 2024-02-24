package cn.itedus.lottery.test.vo2dto;

/**
 * @description: 引入包名转换
 *
 * @date: 2022/1/16
 *
 *
 */
public class ApiTest06 {

    public void test_vo2dto(cn.itedus.lottery.test.vo2dto.bbb.User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserNickName(user.getUserNickName());
        userDTO.setUserHead(user.getUserHead());



    }

}
