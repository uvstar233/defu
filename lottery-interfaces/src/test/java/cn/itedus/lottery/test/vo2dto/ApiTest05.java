package cn.itedus.lottery.test.vo2dto;

/**
 * @description: 同包下对象转换
 *
 * @date: 2022/1/16
 *
 *
 */
public class ApiTest05 {

    public void test_vo2dto(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserNickName(user.getUserNickName());
        userDTO.setUserHead(user.getUserHead());


    }

}
