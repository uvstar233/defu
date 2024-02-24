package cn.itedus.lottery.rpc.activity.booth.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.activity.booth.dto.AwardDTO;

import java.io.Serializable;

/**
 * @description: 抽奖结果
 *
 * @date: 2021/10/16
 *
 *
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}
