package cn.itedus.lottery.domain.activity.model.req;

import cn.itedus.lottery.domain.activity.model.aggregates.ActivityConfigRich;

/**
 * @description: 活动配置请求对象
 *
 * @date: 2021/9/11
 *
 *
 */
public class ActivityConfigReq {

    /** 活动ID */
    private Long activityId;

    /** 活动配置信息 */
    private ActivityConfigRich activityConfigRich;

    public ActivityConfigReq() {
    }
    /** 请求创建活动时需要提供活动id和整个活动配置聚集对象 */
    public ActivityConfigReq(Long activityId, ActivityConfigRich activityConfigRich) {
        this.activityId = activityId;
        this.activityConfigRich = activityConfigRich;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public ActivityConfigRich getActivityConfigRich() {
        return activityConfigRich;
    }

    public void setActivityConfigRich(ActivityConfigRich activityConfigRich) {
        this.activityConfigRich = activityConfigRich;
    }

}
