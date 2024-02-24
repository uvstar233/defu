package cn.itedus.lottery.application.process.draw.res;

import cn.itedus.lottery.common.Result;

/**
 * @description:
 *
 * @date: 2021/10/16
 *
 *
 */
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
